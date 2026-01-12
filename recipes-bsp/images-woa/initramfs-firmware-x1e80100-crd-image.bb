DESCRIPTION = "Tiny ramdisk image with X1E80100 CRD devices firmware files"

PACKAGE_INSTALL += " \
    packagegroup-x1e80100-crd-firmware \
"

require recipes-bsp/images/initramfs-firmware-image.inc
