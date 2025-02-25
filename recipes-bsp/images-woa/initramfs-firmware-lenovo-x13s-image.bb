DESCRIPTION = "Tiny ramdisk image with Lenovo X13s firmware files"

PACKAGE_INSTALL += " \
    packagegroup-lenovo-x13s-firmware \
"

require recipes-bsp/images/initramfs-firmware-image.inc
