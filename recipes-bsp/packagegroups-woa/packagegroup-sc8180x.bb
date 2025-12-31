SUMMARY = "Packages for the SC8180X devices"

inherit packagegroup

PACKAGES = " \
    ${PN}-firmware \
"

RRECOMMENDS:${PN}-firmware = " \
    ${@bb.utils.contains_any('DISTRO_FEATURES', 'opencl opengl vulkan', 'linux-firmware-qcom-adreno-a640 linux-firmware-qcom-sc8180x-adreno', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'bluetooth', 'linux-firmware-qca-wcn399x', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wifi', 'linux-firmware-ath10k-wcn3990', '', d)} \
    firmware-qcom-sc8180x \
    linux-firmware-qcom-sc8180x-audio \
    linux-firmware-qcom-sc8180x-compute \
    linux-firmware-qcom-sc8180x-ipa \
    linux-firmware-qcom-sc8180x-modem \
    linux-firmware-qcom-sc8180x-sensors \
    linux-firmware-qcom-sc8180x-venus \
"
