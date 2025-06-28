DESCRIPTION = "Tiny ramdisk image with Lenovo Yoga Slim7x firmware files"

PACKAGE_INSTALL += " \
    packagegroup-lenovo-yoga-slim7x-firmware \
"

require recipes-bsp/images/initramfs-firmware-image.inc
