DESCRIPTION = "Tiny ramdisk image with all Nexus and Pixel devices firmware files"

PACKAGE_INSTALL += " \
    packagegroup-ifc6560-firmware \
"

BAD_RECOMMENDATIONS = "\
    linux-firmware-qcom-sda660-audio \
    linux-firmware-qcom-sda660-compute \
    linux-firmware-qcom-sda660-modem \
    linux-firmware-qcom-sda660-venus \
"

require recipes-bsp/images/initramfs-firmware-image.inc
