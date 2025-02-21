DESCRIPTION = "Tiny ramdisk image with Lenovo Yoga C630 firmware files"

PACKAGE_INSTALL += " \
    packagegroup-lenovo-yoga-c630-firmware \
"

require recipes-bsp/images/initramfs-firmware-image.inc
