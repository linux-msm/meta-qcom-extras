DESCRIPTION = "Tiny ramdisk image with IFC6410 firmware files"

PACKAGE_INSTALL += " \
    packagegroup-ifc6410-firmware \
"

require recipes-bsp/images/initramfs-firmware-image.inc
