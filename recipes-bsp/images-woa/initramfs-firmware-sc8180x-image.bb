DESCRIPTION = "Tiny ramdisk image with SC8180X devices firmware files"

PACKAGE_INSTALL += " \
    packagegroup-sc8180x-firmware \
"

require recipes-bsp/images/initramfs-firmware-image.inc
