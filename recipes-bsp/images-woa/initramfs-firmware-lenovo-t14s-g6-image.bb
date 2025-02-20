DESCRIPTION = "Tiny ramdisk image with Lenovo T14s G6 firmware files"

PACKAGE_INSTALL += " \
    packagegroup-firmware-lenovo-t14s-g6 \
"

require recipes-bsp/images/initramfs-firmware-image.inc
