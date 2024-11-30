DESCRIPTION = "Tiny ramdisk image with Pixel 3 firmware files"

PACKAGE_INSTALL += " \
    linux-firmware-ath10k-wcn3990 \
    linux-firmware-qca \
    firmware-qcom-pixel3 \
"

require recipes-bsp/images/initramfs-firmware-image.inc
