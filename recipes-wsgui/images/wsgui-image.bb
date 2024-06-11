inherit core-image

IMAGE_ROOTFS_EXTRA_SPACE = "1000000"

IMAGE_INSTALL += " \
  ttf-roboto \
  packagegroup-qt6-modules \
  "
