SUMMARY = "Packages for the Lenovo X13s laptop"

inherit packagegroup

PACKAGES = " \
    ${PN}-firmware \
"

RRECOMMENDS:${PN}-firmware = " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'linux-firmware-qcom-adreno-a660 linux-firmware-qcom-sc8280xp-lenovo-x13s-adreno', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wifi', 'linux-firmware-ath11k-wcn6855', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'bluetooth', 'linux-firmware-qca-qca2066', '', d)} \
    linux-firmware-qcom-sc8280xp-lenovo-x13s-audio \
    linux-firmware-qcom-sc8280xp-lenovo-x13s-compute \
    linux-firmware-qcom-sc8280xp-lenovo-x13s-sensors \
"
