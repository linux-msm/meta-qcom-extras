SUMMARY = "Packages for the ECS LIVA QC710 devices"

inherit packagegroup

PACKAGES = " \
    ${PN}-firmware \
"

RRECOMMENDS:${PN}-firmware = " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'linux-firmware-qcom-adreno-a630 linux-firmware-qcom-ecs-liva-qc710-adreno', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'bluetooth', 'linux-firmware-qca-wcn399x', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wifi', 'linux-firmware-ath10k-wcn3990 linux-firmware-qcom-ecs-liva-qc710-wifi', '', d)} \
    firmware-qcom-ecs-liva-qc710 \
    linux-firmware-qcom-ecs-liva-qc710-audio \
    linux-firmware-qcom-ecs-liva-qc710-compute \
    linux-firmware-qcom-ecs-liva-qc710-ipa \
    linux-firmware-qcom-ecs-liva-qc710-modem \
    linux-firmware-qcom-ecs-liva-qc710-venus \
"
