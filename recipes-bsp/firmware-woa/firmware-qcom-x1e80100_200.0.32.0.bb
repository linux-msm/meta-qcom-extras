DESCRIPTION = "Qualcomm Firmware for Compute X1E80100 CRD device"

LICENSE = "CLOSED"

FW_QCOM_NAME = "x1e80100"
WOA_SUBDIR = "8380_CRD"

WOA_CABINETS = " \
    qcdx8380.cab;name=dx \
    qcwlanmsl8380.cab;name=wlan \
"

SRC_URI = " \
    ${WOA_SRC_URI} \
"

SRC_URI[dx.sha256sum] = "fce26a9c95ff8f5ddbc58312dfad9d1d317bda1a9a854ea49290acb34485bbbd"
SRC_URI[wlan.sha256sum] = "30b7a7254469be777672a1a99e1d3049f20632471378cd33df5108e8be056e99"

SPLIT_FIRMWARE_PACKAGES = "\
    linux-firmware-qcom-${FW_QCOM_NAME}-venus \
    linux-firmware-qcom-${FW_QCOM_NAME}-wifi \
"

FILES:linux-firmware-qcom-${FW_QCOM_NAME}-wifi:append = " ${FW_QCOM_PATH}/wpss.mbn"

require firmware-woa.inc
