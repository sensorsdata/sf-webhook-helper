/*
 * Copyright 2019 Sensors Data Co., Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sensorsdata.webhook.entry;

import lombok.Data;

import java.util.Map;

@Data
public class SfWebhookRequestEntry {
  /**
   * 神策项目名
   */
  String projectName;

  /**
   * SF 版本号
   */
  String sfVersion;

  /**
   * 用户 ID 信息
   */
  UserProfile userProfile;

  /**
   * 一些请求的元数据
   */
  ReceiptProperties receiptProperties;

  /**
   * Webhook 配置的动态&静态参数
   */
  Map<String, String> params;

  /**
   * 发送 ID
   */
  String sendId;

  /**
   * 计划、画布相关信息
   */
  PlanInfo planInfo;

  /**
   * 用户的 ID 信息
   * https://www.sensorsdata.cn/manual/user_identify.html
   */
  @Data
  public static class UserProfile {
    /**
     * 神策 events 表的 user_id，users 表的 id
     */
    Long userId;
    /**
     * 设备 ID
     */
    String firstId;
    /**
     * 登录 ID
     */
    String secondId;
  }


  @Data
  public static class ReceiptProperties {
    String sfMsgId;
    Integer sfPlanId;
    Integer sfPlanAudienceId;
    Integer sfPlanStrategyId;
    Integer sfStrategyUnitId;
    String sfPlanType;
    Integer sfChannelId;
    String sfChannelCategory;
    Long sfEnterPlanTime;
    String sfPlanVersion;
    Integer sfComponentId;
    Long sfSendTime;
  }

  @Data
  public static class PlanInfo {

    /**
     * 计划、画布名称
     */
    String cname;

    /**
     * 类型
     */
    String type;

    /**
     * 定时单次、定时重复、触发型
     */
    String scheduleType;

    /**
     * 结束时间
     */
    Long finishTime;

    /**
     * 新画布组件名称
     */
    String componentCname;

  }
}

