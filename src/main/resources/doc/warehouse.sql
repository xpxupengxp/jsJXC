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

 Date: 13/03/2019 15:14:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for js_bill_disposal
-- ----------------------------
DROP TABLE IF EXISTS `js_bill_disposal`;
CREATE TABLE `js_bill_disposal`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `bill_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '单据名称',
  `bill_no` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '单据号',
  `bill_type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '单据类型',
  `total_price` decimal(19, 2) NULL DEFAULT NULL COMMENT '合计金额',
  `user_id` int(11) NULL DEFAULT NULL COMMENT '经办人',
  `action_time` datetime NULL DEFAULT NULL COMMENT '经办时间',
  `c_id` int(11) NULL DEFAULT NULL COMMENT '商家ID',
  `cu_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系人姓名',
  `cu_mobile` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系人电话',
  `trans_address` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交货地点',
  `bill_desc` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '单据备注',
  `audit_process_id` int(11) NULL DEFAULT NULL COMMENT '审核流程ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for js_bill_disposal_detail
-- ----------------------------
DROP TABLE IF EXISTS `js_bill_disposal_detail`;
CREATE TABLE `js_bill_disposal_detail`  (
  `detail_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '单据明细ID',
  `m_id` bigint(20) NULL DEFAULT NULL COMMENT '物料ID',
  `sb_pcode` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '物料批次号',
  `m_num` decimal(19, 2) NULL DEFAULT NULL COMMENT '数量',
  `m_price` decimal(19, 2) NULL DEFAULT NULL COMMENT '单价',
  `m_units` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '单位',
  `m_subtotal` decimal(19, 2) NULL DEFAULT NULL COMMENT '小计',
  `sb_detail_desc` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '明细备注',
  `m_in_type` int(11) NULL DEFAULT NULL COMMENT '物料入库类型',
  `check_state` int(11) NULL DEFAULT NULL COMMENT '检验状态',
  `check_level` int(11) NULL DEFAULT NULL COMMENT '检验等级',
  `check_time` datetime NULL DEFAULT NULL COMMENT '检验时间',
  `check_u_id` decimal(19, 0) NULL DEFAULT NULL COMMENT '检验人员ID',
  `wh_id` decimal(19, 0) NULL DEFAULT NULL COMMENT '仓库编号',
  `whb_id` decimal(19, 0) NULL DEFAULT NULL COMMENT '仓库分区ID',
  `sb_id` bigint(20) NULL DEFAULT NULL COMMENT '单据ID',
  `audit_process_id` int(11) NULL DEFAULT NULL COMMENT '审核流程ID',
  `is_effective` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否有效',
  PRIMARY KEY (`detail_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;


-- ----------------------------
-- Table structure for js_materials_difference
-- ----------------------------
DROP TABLE IF EXISTS `js_materials_difference`;
CREATE TABLE `js_materials_difference`  (
  `m_real_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '物料笔数编号',
  `difference_num` decimal(18, 2) NULL DEFAULT NULL COMMENT '差异数量',
  `system_num` decimal(18, 2) NULL DEFAULT NULL COMMENT '系统数量',
  `real_num` decimal(18, 2) NULL DEFAULT NULL COMMENT '实际数量',
  `operator` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经办人',
  `operate_date` datetime NULL DEFAULT NULL COMMENT '经办时间',
  `result` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '处理结果',
  `memo` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `audit_process_id` int(11) NULL DEFAULT NULL COMMENT '审核流程ID',
  PRIMARY KEY (`m_real_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for js_materials_faulty
-- ----------------------------
DROP TABLE IF EXISTS `js_materials_faulty`;
CREATE TABLE `js_materials_faulty`  (
  `m_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '物料ID',
  `faulty_num` decimal(18, 2) NULL DEFAULT NULL COMMENT '报损数量',
  `operator` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经办人',
  `operate_date` datetime NULL DEFAULT NULL COMMENT '经办时间',
  `result` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '处理结果',
  `memo` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `audit_process_id` int(11) NULL DEFAULT NULL COMMENT '审核流程ID',
  `is_filished` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否完成',
  PRIMARY KEY (`m_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for js_take_stock
-- ----------------------------
DROP TABLE IF EXISTS `js_take_stock`;
CREATE TABLE `js_take_stock`  (
  `ts_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `wh_id` decimal(19, 0) NULL DEFAULT NULL COMMENT '仓库编号',
  `m_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '物料编号',
  `kc_count` decimal(19, 2) NULL DEFAULT NULL COMMENT '原库存数',
  `ts_pcode` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '批次号',
  `ts_u_id` decimal(19, 0) NULL DEFAULT NULL COMMENT '盘点人员',
  `ts_desc` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '盘点备注',
  `ts_time` datetime NULL DEFAULT NULL COMMENT '盘点时间',
  `auditor` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '审核人',
  `audit_process_id` int(11) NULL DEFAULT NULL COMMENT '审核流程ID',
  PRIMARY KEY (`ts_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for js_warehouse
-- ----------------------------
DROP TABLE IF EXISTS `js_warehouse`;
CREATE TABLE `js_warehouse`  (
  `wh_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '仓库编号',
  `wh_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '仓库名称',
  `wh_address` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '仓库地址',
  `wh_capacity` decimal(19, 2) NULL DEFAULT NULL COMMENT '仓库容量',
  `wh_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '仓库编码',
  `wh_desc` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '仓库描述',
  `wh_site` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '仓库地点',
  `wh_type_id` int(11) NULL DEFAULT NULL COMMENT '仓库类型ID',
  `wh_warn_val` decimal(18, 2) NULL DEFAULT NULL COMMENT '预警值',
  `org_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属机构',
  PRIMARY KEY (`wh_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for js_warehouse_block
-- ----------------------------
DROP TABLE IF EXISTS `js_warehouse_block`;
CREATE TABLE `js_warehouse_block`  (
  `wb_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '分区编号',
  `wb_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '分区名称',
  `wb_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分区编码',
  `wb_area` int(11) NULL DEFAULT NULL COMMENT '分区编号',
  `wb_row` int(11) NULL DEFAULT NULL COMMENT '所属行数',
  `wb_col` int(11) NULL DEFAULT NULL COMMENT '所属列数',
  `wb_parent_id` int(11) NULL DEFAULT NULL COMMENT '所属对象',
  `wb_floor` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1' COMMENT '所属楼层',
  `wh_id` decimal(19, 0) NULL DEFAULT NULL COMMENT '所属仓库ID',
  `wb_desc` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`wb_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for js_warehouse_m_alert_form
-- ----------------------------
DROP TABLE IF EXISTS `js_warehouse_m_alert_form`;
CREATE TABLE `js_warehouse_m_alert_form`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `alert_color` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '颜色',
  `alert_sound` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '声音文件',
  `alert_picture` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图像文件',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for js_warehouse_material_mov
-- ----------------------------
DROP TABLE IF EXISTS `js_warehouse_material_mov`;
CREATE TABLE `js_warehouse_material_mov`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `m_id` bigint(20) NULL DEFAULT NULL COMMENT '物料ID',
  `bef_wh_id` int(11) NULL DEFAULT NULL COMMENT '移动前仓库ID',
  `aft_wh_id` int(11) NULL DEFAULT NULL COMMENT '移动后仓库ID',
  `pre_wh_block_id` int(11) NULL DEFAULT NULL COMMENT '移动前分区ID',
  `aft_block_id` int(11) NULL DEFAULT NULL COMMENT '移动后分区ID',
  `user_id` bigint(20) NULL DEFAULT NULL COMMENT '入库人员',
  `mov_date` datetime NULL DEFAULT NULL COMMENT '移动时间',
  `mov_reason` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '移动原因',
  `mov_type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '移动类型',
  `mov_target` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '目标去向',
  `audit_process_id` int(11) NULL DEFAULT NULL COMMENT '审核流程ID',
  `in_store_id` bigint(20) NULL DEFAULT NULL COMMENT '入库单ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for js_warehouse_type
-- ----------------------------
DROP TABLE IF EXISTS `js_warehouse_type`;
CREATE TABLE `js_warehouse_type`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `type_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类型编码',
  `type_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类型名称',
  `is_special` int(11) NULL DEFAULT 0 COMMENT '特定仓库标志',
  `type_desc` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类型描述',
  `type_parentid` int(11) NULL DEFAULT NULL COMMENT '所属仓库ID',
  `initial` int(11) NULL DEFAULT NULL COMMENT '初始仓库标志',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for js_warehouse_user
-- ----------------------------
DROP TABLE IF EXISTS `js_warehouse_user`;
CREATE TABLE `js_warehouse_user`  (
  `whu_id` int(19) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `user_id` decimal(19, 0) NULL DEFAULT NULL COMMENT '用户ID',
  `wh_id` decimal(19, 0) NULL DEFAULT NULL COMMENT '仓库ID',
  `whu_desc` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '关联描述（默认：库存员）',
  PRIMARY KEY (`whu_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for js_warehouseblock_material_object
-- ----------------------------
DROP TABLE IF EXISTS `js_warehouseblock_material_object`;
CREATE TABLE `js_warehouseblock_material_object`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `wb_id` int(11) NULL DEFAULT NULL COMMENT '仓库块位ID',
  `m_id` int(11) NULL DEFAULT NULL COMMENT '物料类别ID',
  `memo` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for js_wherehouse_materials
-- ----------------------------
DROP TABLE IF EXISTS `js_wherehouse_materials`;
CREATE TABLE `js_wherehouse_materials`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `w_id` int(11) NULL DEFAULT NULL COMMENT '仓库编号',
  `m_real_id` bigint(20) NULL DEFAULT NULL COMMENT '物料笔数编号',
  `store_keeper` int(11) NULL DEFAULT NULL COMMENT '库管员ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for js_wherehouse_outcoming
-- ----------------------------
DROP TABLE IF EXISTS `js_wherehouse_outcoming`;
CREATE TABLE `js_wherehouse_outcoming`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '出库编号',
  `w_id` int(11) NULL DEFAULT NULL COMMENT '仓库编号',
  `m_real_id` bigint(20) NULL DEFAULT NULL COMMENT '物料笔数编号',
  `out_date` datetime NULL DEFAULT NULL COMMENT '出库时间',
  `store_keeper` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '库管员',
  `m_number` decimal(18, 2) NULL DEFAULT NULL COMMENT '出库数量',
  `memo` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '出库说明',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for m_material_disposal
-- ----------------------------
DROP TABLE IF EXISTS `m_material_disposal`;
CREATE TABLE `m_material_disposal`  (
  `m_real_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '物料笔数编号',
  `m_disposal_type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '处置类型',
  `m_num` decimal(18, 2) NULL DEFAULT NULL COMMENT '物料数量',
  `m_staff` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经办人',
  `m_disposal_date` datetime NULL DEFAULT NULL COMMENT '经办日期',
  `check_process_id` bigint(20) NULL DEFAULT NULL COMMENT '审核流程ID',
  `m_disposal_result` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '处置结果',
  `special_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '持殊编码',
  `is_filished` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否完成',
  PRIMARY KEY (`m_real_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
