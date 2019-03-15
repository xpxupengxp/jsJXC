/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           : localhost:3306
 Source Schema         : jsjxc

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : 65001

 Date: 15/03/2019 12:00:52
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for js_material_list
-- ----------------------------
DROP TABLE IF EXISTS `js_material_list`;
CREATE TABLE `js_material_list`  (
  `m_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '物料ID',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '物料名称',
  `code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '物料编码',
  `m_type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '物料型号',
  `m_specification` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '物料规格',
  `category` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类别',
  `m_image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '物料图片',
  `m_sound` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '声音',
  `purpose` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用途',
  `security_value` tinyint(4) NULL DEFAULT 10 COMMENT '当前安全值',
  `m_video` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '视频',
  `shape` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '形态',
  `m_qrcode` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '二维码',
  `m_qrcode_addr` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '二维码地址',
  `memo` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `m_barcode` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '条码',
  `m_barcode_addr` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '条码地址',
  `m_visual_data` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '视觉数据',
  `is_alert` tinyint(4) NULL DEFAULT NULL COMMENT '系统是否报警',
  `default_warehouseID` int(11) NULL DEFAULT NULL COMMENT '默认仓库',
  `m_total` decimal(18, 2) NULL DEFAULT NULL COMMENT '物料总数',
  PRIMARY KEY (`m_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 26 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of js_material_list
-- ----------------------------
INSERT INTO `js_material_list` VALUES (22, '20', '20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0.00);
INSERT INTO `js_material_list` VALUES (23, '20', '20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 70.00);
INSERT INTO `js_material_list` VALUES (24, '20', '20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0.00);
INSERT INTO `js_material_list` VALUES (25, '20', '20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 40.00);

SET FOREIGN_KEY_CHECKS = 1;
