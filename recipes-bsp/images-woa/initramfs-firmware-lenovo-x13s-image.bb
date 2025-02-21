DESCRIPTION = "Tiny ramdisk image with Lenovo X13s firmware files"

PACKAGE_INSTALL += " \
    packagegroup-firmware-lenovo-x13s \
"

require recipes-bsp/images/initramfs-firmware-image.inc
