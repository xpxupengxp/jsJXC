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

 Date: 07/03/2019 18:08:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for js_old_sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `js_old_sys_permission`;
CREATE TABLE `js_old_sys_permission`  (
  `perms_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '权限编号',
  `perms_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限描述',
  `perms_img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限图标',
  `perms_level` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '菜单级别',
  `perms_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限名称',
  `perms_name_cn` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '中文权限名',
  `perms_parentid` int(11) NULL DEFAULT NULL COMMENT '父权限ID',
  `perms_type` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限类型',
  `perms_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'URL地址',
  `sequence` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '排序值',
  `object_id` varbinary(50) NULL DEFAULT NULL COMMENT '对象编号',
  `status` int(11) NULL DEFAULT NULL COMMENT '状态（0:禁用，1:正常）',
  PRIMARY KEY (`perms_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of js_old_sys_permission
-- ----------------------------
INSERT INTO `js_old_sys_permission` VALUES (1, '人事菜单', NULL, '一级', 'hr', '人事管理', -1, '人事类型', 'js/rs', NULL, NULL, 1);
INSERT INTO `js_old_sys_permission` VALUES (2, '客户菜单', NULL, '一级', 'client', '客户管理', -1, '客户类型', 'js/kh', NULL, NULL, 1);
INSERT INTO `js_old_sys_permission` VALUES (3, '订单菜单', NULL, '一级', 'order', '订单管理', -1, '订单类型', 'js/dd', NULL, NULL, 1);
INSERT INTO `js_old_sys_permission` VALUES (4, '人员菜单', NULL, '二级', 'emp', '人员管理', 1, '人员类型', 'js/rs/ry', NULL, NULL, 1);
INSERT INTO `js_old_sys_permission` VALUES (5, '待审订单的很多描述', NULL, '二级', 'pending trial', '待审订单', 3, '待审类型', 'js/dd/ds', NULL, NULL, 1);

-- ----------------------------
-- Table structure for js_org
-- ----------------------------
DROP TABLE IF EXISTS `js_org`;
CREATE TABLE `js_org`  (
  `org_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `org_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '组织编码',
  `org_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '组织描述',
  `org_name` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '组织名称',
  `org_parentid` int(11) NULL DEFAULT NULL COMMENT '所属组织',
  `org_sequence` int(11) NULL DEFAULT NULL COMMENT '组织排序',
  `org_type_id` int(11) NULL DEFAULT NULL COMMENT '组织类型ID',
  `object_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '对象编号',
  `status` int(11) NULL DEFAULT NULL COMMENT '状态（0:禁用，1:正常）',
  PRIMARY KEY (`org_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of js_org
-- ----------------------------
INSERT INTO `js_org` VALUES (1, '111', '组织很棒', '锦声一号', 11, NULL, 1, NULL, 1);
INSERT INTO `js_org` VALUES (2, '222', '组织很好', '锦声二号', 22, NULL, 2, NULL, 1);

-- ----------------------------
-- Table structure for js_sys_data_maintain
-- ----------------------------
DROP TABLE IF EXISTS `js_sys_data_maintain`;
CREATE TABLE `js_sys_data_maintain`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `object_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '对象编号',
  `act_u_id` bigint(20) NULL DEFAULT NULL COMMENT '创建人',
  `inserttime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `deleted` int(11) NULL DEFAULT NULL COMMENT '删除标志',
  `enable` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '允许标志',
  `hided` int(11) NULL DEFAULT NULL COMMENT '隐藏标志',
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `ip` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建IP',
  `op` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限标志',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for js_sys_employee
-- ----------------------------
DROP TABLE IF EXISTS `js_sys_employee`;
CREATE TABLE `js_sys_employee`  (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '员工ID',
  `user_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '员工编号',
  `user_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `user_mobile` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机',
  `user_telephone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `user_address` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  `user_qq` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'qq',
  `user_email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电子邮件',
  `user_sex` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `birthday` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '生日',
  `id_card` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '员工卡',
  `education` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '教育程度',
  `user_base_remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户基本评语',
  `user_ethnicity` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '民族',
  `user_hukou` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '户口',
  `user_hunyin` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '婚姻',
  `user_Induction` datetime(0) NULL DEFAULT NULL COMMENT '入职时间',
  `user_join_insurance` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户参保',
  `user_shebao` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '社保',
  `user_labor_contract_end` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '合同终止时间',
  `user_labor_contract_start` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '合同开始时间',
  `user_labor_relations` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '劳动关系',
  `user_linkman_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系人电话',
  `user_other_insurance` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '参加意外保险',
  `user_other_linkman` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '其他联系人',
  `user_place_now` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '现居住地',
  `user_Photo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '员工照片',
  `user_zzmm` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '政治面貌',
  `is_master` tinyint(255) NULL DEFAULT NULL COMMENT '是否正式员工',
  `object_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '对象编号',
  `org_id` int(11) NULL DEFAULT NULL COMMENT '所属组织',
  `status` int(11) NULL DEFAULT NULL COMMENT '状态（0:禁用，1:正常）',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of js_sys_employee
-- ----------------------------
INSERT INTO `js_sys_employee` VALUES (1, '001', '一号', '16615985446', '87564894', '重庆市大渡口区', '52664878', '52664878@qq.com', '男', '1890-01-17', '111', '本科', '好', '汉', '重庆', '否', '2018-05-28 00:00:00', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, 1);
INSERT INTO `js_sys_employee` VALUES (2, '002', '二号', '16615985447', '87564894', '重庆市大渡口区', '52664878', '52664878@qq.com', '男', '1890-02-17', '222', '本科', '好', '汉', '重庆', '否', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 2, 1);
INSERT INTO `js_sys_employee` VALUES (3, '003', '三号', '16615985448', '87564894', '重庆市大渡口区', '52664878', '52664878@qq.com', '男', '1890-03-17', '333', '本科', '好', '汉', '重庆', '否', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, 1);
INSERT INTO `js_sys_employee` VALUES (4, '004', '四号', '16615985449', '87564894', '重庆市大渡口区', '52664878', '52664878@qq.com', '男', '1890-04-17', '444', '本科', '好', '汉', '重庆', '否', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 2, 1);
INSERT INTO `js_sys_employee` VALUES (5, '005', '五号', '16615985449', '87564894', '重庆市大渡口区', '52664878', '52664878@qq.com', '男', '1890-05-17', '555', '本科', '好', '汉', '重庆', '否', '2018-05-28 00:00:00', '否', '否', '2018-05-28 00:00:00.000', '2018-05-28 00:00:00.000', '劳动', '15668456255', '否', '多多', '重庆市大渡口', 'js/img', '团员', 1, '001', 1, 1);
INSERT INTO `js_sys_employee` VALUES (6, '1212', '王大', '18796584256', '8455156', '重庆市大渡口区', '568442', '518418@qq.com', '男', '1985-06-16', '666', '本科', '好', '汉', '重庆', '否', '2018-12-14 08:00:00', '否', '否', '2010-08-13', '2010-08-13', '劳动', '18796584256', '否', '王二', '重庆市大渡口区', 'js/img', '团员', 1, '001', 1, 1);

-- ----------------------------
-- Table structure for js_sys_employee_org
-- ----------------------------
DROP TABLE IF EXISTS `js_sys_employee_org`;
CREATE TABLE `js_sys_employee_org`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `user_id` int(11) NULL DEFAULT NULL COMMENT '用户ID',
  `org_id` int(11) NULL DEFAULT NULL COMMENT '组织ID',
  `object_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '对象编号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of js_sys_employee_org
-- ----------------------------
INSERT INTO `js_sys_employee_org` VALUES (1, 1, 1, NULL);
INSERT INTO `js_sys_employee_org` VALUES (2, 2, 2, NULL);
INSERT INTO `js_sys_employee_org` VALUES (3, 3, 1, NULL);
INSERT INTO `js_sys_employee_org` VALUES (4, 4, 2, NULL);

-- ----------------------------
-- Table structure for js_sys_oprate_log
-- ----------------------------
DROP TABLE IF EXISTS `js_sys_oprate_log`;
CREATE TABLE `js_sys_oprate_log`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `object_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '对象编号',
  `act_u_id` bigint(20) NULL DEFAULT NULL COMMENT '操作人员',
  `updatetime` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `act_type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作类型',
  `ip` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '访问IP',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for js_sys_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `js_sys_role_permission`;
CREATE TABLE `js_sys_role_permission`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `role_id` int(11) NULL DEFAULT NULL COMMENT '角色ID',
  `perms_id` int(11) NULL DEFAULT NULL COMMENT '权限ID',
  `object_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '对象编号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of js_sys_role_permission
-- ----------------------------
INSERT INTO `js_sys_role_permission` VALUES (1, 1, 3, NULL);

-- ----------------------------
-- Table structure for js_sys_roles
-- ----------------------------
DROP TABLE IF EXISTS `js_sys_roles`;
CREATE TABLE `js_sys_roles`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名称',
  `rols_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色描述',
  `org` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所在组织',
  `system` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所在系统',
  `object_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '对象编号',
  `status` int(11) NULL DEFAULT NULL COMMENT '状态（0:禁用，1:正常）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of js_sys_roles
-- ----------------------------
INSERT INTO `js_sys_roles` VALUES (1, '程序员', '程序员的码农生涯', '锦声二号', NULL, NULL, 1);
INSERT INTO `js_sys_roles` VALUES (2, '人事', '人事小姐姐', '锦声一号', NULL, NULL, 1);
INSERT INTO `js_sys_roles` VALUES (3, '管理员', '系统管理员', '锦声科技', NULL, NULL, 1);

-- ----------------------------
-- Table structure for js_sys_user_permission
-- ----------------------------
DROP TABLE IF EXISTS `js_sys_user_permission`;
CREATE TABLE `js_sys_user_permission`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `user_id` int(11) NULL DEFAULT NULL COMMENT '用户ID',
  `perms_id` int(11) NULL DEFAULT NULL COMMENT '权限ID',
  `memo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of js_sys_user_permission
-- ----------------------------
INSERT INTO `js_sys_user_permission` VALUES (1, 2, 2, NULL);
INSERT INTO `js_sys_user_permission` VALUES (2, 2, 3, NULL);
INSERT INTO `js_sys_user_permission` VALUES (3, 1, 4, NULL);
INSERT INTO `js_sys_user_permission` VALUES (4, 1, 2, NULL);
INSERT INTO `js_sys_user_permission` VALUES (5, 5, 1, NULL);
INSERT INTO `js_sys_user_permission` VALUES (6, 5, 2, NULL);
INSERT INTO `js_sys_user_permission` VALUES (7, 5, 3, NULL);
INSERT INTO `js_sys_user_permission` VALUES (8, 5, 4, NULL);
INSERT INTO `js_sys_user_permission` VALUES (9, 5, 5, NULL);

-- ----------------------------
-- Table structure for js_sys_user_roles
-- ----------------------------
DROP TABLE IF EXISTS `js_sys_user_roles`;
CREATE TABLE `js_sys_user_roles`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `role_id` int(11) NOT NULL COMMENT '角色ID',
  `object_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '对象编号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for js_sys_users
-- ----------------------------
DROP TABLE IF EXISTS `js_sys_users`;
CREATE TABLE `js_sys_users`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_id` int(11) NULL DEFAULT NULL COMMENT '员工id',
  `nickname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名称',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户密码',
  `user_img` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户头像',
  `token_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '登录识别码',
  `object_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '对象编号',
  `status` int(11) NULL DEFAULT NULL COMMENT '状态（0:禁用，1:正常）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of js_sys_users
-- ----------------------------
INSERT INTO `js_sys_users` VALUES (1, 1, '熊一', '123456', 'baidu/user', '888888', '', 1);
INSERT INTO `js_sys_users` VALUES (2, 2, '熊二', '123456', 'js/img', '666666', '', 1);
INSERT INTO `js_sys_users` VALUES (3, 3, '熊三', '123456', 'baidu/user', '888888', '', 1);
INSERT INTO `js_sys_users` VALUES (4, 4, '熊四', '123456', 'baidu/user', '888888', '', 1);
INSERT INTO `js_sys_users` VALUES (5, 5, '熊五', '123456', 'baidu/user', '888888', '', 1);
INSERT INTO `js_sys_users` VALUES (6, 6, '熊六', '123456', 'js/img', '777777', '', 1);

SET FOREIGN_KEY_CHECKS = 1;
