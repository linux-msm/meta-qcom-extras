DESCRIPTION = "Tiny ramdisk image with IFC6410 firmware files"

PACKAGE_INSTALL += " \
    packagegroup-firmware-ifc6410 \
"

require recipes-bsp/images/initramfs-firmware-image.inc
