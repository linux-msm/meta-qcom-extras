SUMMARY = "Packages for the Lenovo T14s G6 laptop"

inherit packagegroup

PACKAGES = " \
    ${PN}-firmware \
"

RRECOMMENDS:${PN}-firmware = " \
    ${@bb.utils.contains_any('DISTRO_FEATURES', 'opencl opengl vulkan', 'linux-firmware-qcom-adreno-g705 linux-firmware-qcom-x1e80100-lenovo-t14s-g6-adreno', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wifi', 'linux-firmware-ath12k-wcn7850', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'bluetooth', 'linux-firmware-qca-wcn7850', '', d)} \
    linux-firmware-qcom-x1e80100-lenovo-t14s-g6-audio \
    linux-firmware-qcom-x1e80100-lenovo-t14s-g6-compute \
"
