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

 Date: 15/03/2019 11:54:54
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for m_material_packaging_disposal
-- ----------------------------
DROP TABLE IF EXISTS `m_material_packaging_disposal`;
CREATE TABLE `m_material_packaging_disposal`  (
  `m_real_id` bigint(11) NOT NULL COMMENT '物料实物ID',
  `is_repackaging` tinyint(4) NULL DEFAULT NULL COMMENT '是否需要包装',
  `packer` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '打包人员',
  `time_limit` datetime NULL DEFAULT NULL COMMENT '时间限制',
  `disposal_result` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '处置结果',
  `memo` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of m_material_packaging_disposal
-- ----------------------------
INSERT INTO `m_material_packaging_disposal` VALUES (2, 0, '一个人', NULL, '很好', 'dfsd');
INSERT INTO `m_material_packaging_disposal` VALUES (3, 0, '一个人', NULL, '很好', 'dfsd');

-- ----------------------------
-- Table structure for m_material_volume_price
-- ----------------------------
DROP TABLE IF EXISTS `m_material_volume_price`;
CREATE TABLE `m_material_volume_price`  (
  `m_real_id` bigint(11) NOT NULL COMMENT '物料实物ID',
  `m_unit_price` decimal(15, 2) NULL DEFAULT NULL COMMENT '单价',
  `m_number` decimal(18, 2) NULL DEFAULT NULL COMMENT '数量',
  `m_whole_quantity` int(11) NULL DEFAULT NULL COMMENT '整量',
  `m_remainder` int(11) NULL DEFAULT NULL COMMENT '零头',
  `m_value` decimal(15, 2) NULL DEFAULT NULL COMMENT '价值',
  `m_currency` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '货币',
  `m_unit` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '单位'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of m_material_volume_price
-- ----------------------------
INSERT INTO `m_material_volume_price` VALUES (34, 100.00, 20.00, 33, 1, 60.00, '人民币', '元');
INSERT INTO `m_material_volume_price` VALUES (35, 100.00, 20.00, 33, 1, 60.00, '人民币', '元');
INSERT INTO `m_material_volume_price` VALUES (36, 100.00, 20.00, 33, 1, 60.00, '人民币', '元');
INSERT INTO `m_material_volume_price` VALUES (37, 10.00, 50.00, 33, 1, 60.00, '人民币', '元');

SET FOREIGN_KEY_CHECKS = 1;
