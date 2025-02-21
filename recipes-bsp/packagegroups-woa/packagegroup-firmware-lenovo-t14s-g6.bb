SUMMARY = "Firmware packages for the Lenovo T14s G6 laptop"

inherit packagegroup

RRECOMMENDS:${PN} += " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'linux-firmware-qcom-adreno-g750 linux-firmware-qcom-x1e80100-lenovo-t14s-g6-adreno', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wifi', 'linux-firmware-ath12k-wcn7850', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'bluetooth', 'linux-firmware-qca-wcn7850', '', d)} \
    linux-firmware-qcom-x1e80100-lenovo-t14s-g6-audio \
    linux-firmware-qcom-x1e80100-lenovo-t14s-g6-compute \
"
