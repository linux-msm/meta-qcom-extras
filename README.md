# meta-qcom

![latest build](https://github.com/linux-msm/meta-qcom-extras/actions/workflows/push.yml/badge.svg)
![daily builds](https://github.com/linux-msm/meta-qcom-extras/actions/workflows/daily.yml/badge.svg)

## Introduction

OpenEmbedded/Yocto Project layer for Qualcomm based platforms.

This layer depends on:

```
URI: https://github.com/openembedded/openembedded-core.git
layers: meta
branch: master
revision: HEAD
```

```
URI: https://github.com/Linaro/meta-qcom.git
layers: meta
branch: master
revision: HEAD
```

```
URI: https://github.com/openembedded/meta-openembedded.git
layers: meta-oe
branch: master
revision: HEAD
```

## Device support

All contemporary boards are supported by a single qcom-armv8a machine. Please
use it instead of using the per-board configuration file. In order to enable
support for the particular device extend the qcom-armv8a.conf file .


## Quick build

If you're new to the Yocto Project, you might want to read the ![Yocto Project
Quick Build](https://docs.yoctoproject.org/brief-yoctoprojectqs/index.html) 
document in order to setup your Yocto Project build environment. 

From inside ```poky``` folder, clone this repository:

```
git clone https://github.com/linux-msm/meta-qcom-extras
```

and dependencies:

```
git clone https://github.com/qualcomm-linux/meta-qcom
git clone https://github.com/openembedded/meta-openembedded
```

Now, from inside ```poky``` folder initialize your build folder:

```
source oe-init-build-env build
```

The script will cd into the newly created ```build``` folder.
From within this folder, add all layers:

```
bitbake-layers add-layer ../meta-openembedded/meta-oe
bitbake-layers add-layer ../meta-qcom
bitbake-layers add-layer ../meta-qcom-extras
```

Change ```MACHINE``` variable into ```conf/local.conf``` to:

```
MACHINE ?= "qcom-armv8a"
```

Finally, build your images:

```
bitbake core-image-minimal initramfs-firmware-lenovo-x13s-image
```

## Contributing

If you want to contribute changes, you can send Github pull requests at
https://github.com/linux-msm/meta-qcom-extras/pulls.

You can discuss about this layer, on `#linux-msm` on OFTC IRC network.

## Reporting issues

Please report any issue on https://github.com/linux-msm/meta-qcom-extras/issues

## Maintainer(s)

Dmitry Baryshkov <dmitry.baryshkov@linaro.org>
