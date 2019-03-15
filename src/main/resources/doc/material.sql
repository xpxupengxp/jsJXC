/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50713
 Source Host           : localhost:3306
 Source Schema         : jsjxc

 Target Server Type    : MySQL
 Target Server Version : 50713
 File Encoding         : 65001

 Date: 12/03/2019 17:29:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for js_material_factory_information
-- ----------------------------
DROP TABLE IF EXISTS `js_material_factory_information`;
CREATE TABLE `js_material_factory_information`  (
  `m_real_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '物料实物ID',
  `manufacturer_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '生产厂家',
  `manufacture_date` datetime NULL DEFAULT NULL COMMENT '生产日期',
  `manufacture_batch` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '生产批次',
  `expiration_date` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '失效日期',
  `quality_grade` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '出厂等级',
  PRIMARY KEY (`m_real_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

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
  `memo` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `m_barcode` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '条码',
  `m_visual_data` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '视觉数据',
  `is_alert` tinyint(4) NULL DEFAULT NULL COMMENT '系统是否报警',
  `default_warehouseID` int(11) NULL DEFAULT NULL COMMENT '默认仓库',
  `m_total` decimal(18, 2) NULL DEFAULT NULL COMMENT '物料总数',
  PRIMARY KEY (`m_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for js_material_merge_record
-- ----------------------------
DROP TABLE IF EXISTS `js_material_merge_record`;
CREATE TABLE `js_material_merge_record`  (
  `m_real_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '物料实物ID',
  `m_batch` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '物料批次',
  `security_value` tinyint(4) NULL DEFAULT NULL COMMENT '当前安全值',
  `m_source` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '来源',
  `m_package` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '包装',
  `m_store_id` int(11) NULL DEFAULT NULL COMMENT '存放仓库位置ID',
  `m_in_store_time` datetime NULL DEFAULT NULL COMMENT '入库时间',
  `m_in_store_staff` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '入库人员',
  `is_alert` tinyint(4) NULL DEFAULT NULL COMMENT '系统是否报警',
  `memo` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `m_merged_id` bigint(20) NULL DEFAULT NULL COMMENT '合并后ID',
  PRIMARY KEY (`m_real_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for js_material_pieces
-- ----------------------------
DROP TABLE IF EXISTS `js_material_pieces`;
CREATE TABLE `js_material_pieces`  (
  `m_real_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '物料实物ID',
  `m_id` bigint(20) NULL DEFAULT NULL COMMENT '物料ID',
  `m_batch` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '物料批次',
  `m_category_id` bigint(20) NULL DEFAULT NULL COMMENT '物料类别',
  `m_source` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '来源',
  `m_package` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '包装',
  `m_store_id` int(11) NULL DEFAULT NULL COMMENT '存放仓库ID',
  `m_store_area_id` int(11) NULL DEFAULT NULL COMMENT '仓库存放位置ID',
  `m_in_store_time` datetime NULL DEFAULT NULL COMMENT '入库时间',
  `m_in_store_staff` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '入库人员',
  `memo` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `is_splited` tinyint(4) NULL DEFAULT NULL COMMENT '拆分标志',
  PRIMARY KEY (`m_real_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for js_material_quality
-- ----------------------------
DROP TABLE IF EXISTS `js_material_quality`;
CREATE TABLE `js_material_quality`  (
  `m_real_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '物料实物ID',
  `c_result` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '检验结果',
  `c_isinspection` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否检验',
  `c_inspection_grade` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '检验等级',
  `c_Inspector` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '检验人员',
  `c_inspection_date` datetime NULL DEFAULT NULL COMMENT '检验日期',
  `c_inspection_memo` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`m_real_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for js_material_split_record
-- ----------------------------
DROP TABLE IF EXISTS `js_material_split_record`;
CREATE TABLE `js_material_split_record`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `m_real_id` bigint(20) NOT NULL COMMENT '物料实物ID',
  `split_num` int(11) NULL DEFAULT NULL COMMENT '拆分后笔数',
  `split_reason` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '拆分原因',
  `split_date` datetime NULL DEFAULT NULL COMMENT '操作时间',
  `operator` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作人员',
  `m_split_ids` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '拆分后ID',
  `split_nums` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '拆分后数量',
  `memo` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for js_meterial_correlation
-- ----------------------------
DROP TABLE IF EXISTS `js_meterial_correlation`;
CREATE TABLE `js_meterial_correlation`  (
  `m_real_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '物料实物ID',
  `order_id` bigint(20) NULL DEFAULT NULL COMMENT '销售订单ID',
  `purchase_order_id` bigint(20) NULL DEFAULT NULL COMMENT '采购单ID',
  `outsourcing_orders` bigint(20) NULL DEFAULT NULL COMMENT '委外订单ID',
  `productive_task_order` bigint(20) NULL DEFAULT NULL COMMENT '生产任务单ID',
  `purchase_inbound_order_id` bigint(20) NULL DEFAULT NULL COMMENT '外购入库单ID',
  `outsourcing_inbound_order_id` bigint(20) NULL DEFAULT NULL COMMENT '委外入库单ID',
  `product_inbound_order_id` bigint(20) NULL DEFAULT NULL COMMENT '产品入库ID',
  `material_outbound_order_id` bigint(20) NULL DEFAULT NULL COMMENT '物料出库单ID',
  `outsourcing_outbound_order_id` bigint(20) NULL DEFAULT NULL COMMENT '委外出库单ID',
  `order_outbound_id` bigint(20) NULL DEFAULT NULL COMMENT '销售出库单ID',
  `distribution_sheet` bigint(20) NULL DEFAULT NULL COMMENT '配送单ID',
  `supplier_outbound_order_id` bigint(20) NULL DEFAULT NULL COMMENT '供应商出库单ID',
  PRIMARY KEY (`m_real_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
