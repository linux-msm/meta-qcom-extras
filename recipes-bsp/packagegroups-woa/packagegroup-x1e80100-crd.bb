SUMMARY = "Packages for the X1E80100 CRD devices"

inherit packagegroup

PACKAGES = " \
    ${PN}-firmware \
"

RRECOMMENDS:${PN}-firmware = " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'linux-firmware-qcom-adreno-g750 linux-firmware-qcom-x1e80100-adreno', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'bluetooth', 'linux-firmware-qca-wcn7850', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wifi', 'linux-firmware-ath12k-wcn7850 linux-firmware-qcom-x1e80100-wifi', '', d)} \
    firmware-qcom-x1e80100 \
    linux-firmware-qcom-x1e80100-audio \
    linux-firmware-qcom-x1e80100-compute \
    linux-firmware-qcom-x1e80100-venus \
"
