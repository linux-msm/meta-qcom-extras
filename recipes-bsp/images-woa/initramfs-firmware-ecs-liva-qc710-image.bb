DESCRIPTION = "Tiny ramdisk image with ECS Liva QC710 devices firmware files"

PACKAGE_INSTALL += " \
    packagegroup-ecs-liva-qc710-firmware \
"

require recipes-bsp/images/initramfs-firmware-image.inc
