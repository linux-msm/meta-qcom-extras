DESCRIPTION = "Tiny ramdisk image with Lenovo Miix 630 firmware files"

PACKAGE_INSTALL += " \
    packagegroup-lenovo-miix-630-firmware \
"

require recipes-bsp/images/initramfs-firmware-image.inc
