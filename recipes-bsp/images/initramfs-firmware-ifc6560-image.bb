DESCRIPTION = "Tiny ramdisk image with all Nexus and Pixel devices firmware files"

PACKAGE_INSTALL += " \
    packagegroup-ifc6560-firmware \
"

require recipes-bsp/images/initramfs-firmware-image.inc
