DESCRIPTION = "Tiny ramdisk image with SC8180X devices firmware files"

PACKAGE_INSTALL += " \
    packagegroup-sc8180x-firmware \
"

BAD_RECOMMENDATIONS = " \
    linux-firmware-qca \
    linux-firmware-qcom-sc8180x-compute \
    linux-firmware-qcom-sc8180x-sensors \
    linux-firmware-qcom-sc8180x-venus \
"

require recipes-bsp/images/initramfs-firmware-image.inc
