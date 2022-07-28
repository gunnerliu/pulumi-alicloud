// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cfg.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDeliveriesDelivery {
    /**
     * @return The Aliyun User Id.
     * 
     */
    private final String accountId;
    /**
     * @return Open or close delivery configuration change history.
     * 
     */
    private final Boolean configurationItemChangeNotification;
    /**
     * @return Open or close timed snapshot of shipping resources.
     * 
     */
    private final Boolean configurationSnapshot;
    /**
     * @return The Alibaba Cloud Resource Name (ARN) of the role to be assumed by the delivery method.
     * 
     */
    private final String deliveryChannelAssumeRoleArn;
    /**
     * @return The rule attached to the delivery method.
     * 
     */
    private final String deliveryChannelCondition;
    /**
     * @return The ID of the delivery method.
     * 
     */
    private final String deliveryChannelId;
    /**
     * @return The name of the delivery method.
     * 
     */
    private final String deliveryChannelName;
    /**
     * @return The ARN of the delivery destination.
     * 
     */
    private final String deliveryChannelTargetArn;
    /**
     * @return The type of the delivery method.
     * 
     */
    private final String deliveryChannelType;
    /**
     * @return The description of the delivery method.
     * 
     */
    private final String description;
    /**
     * @return The ID of the Delivery.
     * 
     */
    private final String id;
    /**
     * @return Open or close non-compliance events of delivery resources.
     * 
     */
    private final Boolean nonCompliantNotification;
    /**
     * @return The oss ARN of the delivery channel when the value data oversized limit.
     * 
     */
    private final String oversizedDataOssTargetArn;
    /**
     * @return The status of the delivery method. Valid values: `0`: The delivery method is disabled. `1`: The delivery destination is enabled.
     * 
     */
    private final Integer status;

    @CustomType.Constructor
    private GetDeliveriesDelivery(
        @CustomType.Parameter("accountId") String accountId,
        @CustomType.Parameter("configurationItemChangeNotification") Boolean configurationItemChangeNotification,
        @CustomType.Parameter("configurationSnapshot") Boolean configurationSnapshot,
        @CustomType.Parameter("deliveryChannelAssumeRoleArn") String deliveryChannelAssumeRoleArn,
        @CustomType.Parameter("deliveryChannelCondition") String deliveryChannelCondition,
        @CustomType.Parameter("deliveryChannelId") String deliveryChannelId,
        @CustomType.Parameter("deliveryChannelName") String deliveryChannelName,
        @CustomType.Parameter("deliveryChannelTargetArn") String deliveryChannelTargetArn,
        @CustomType.Parameter("deliveryChannelType") String deliveryChannelType,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("nonCompliantNotification") Boolean nonCompliantNotification,
        @CustomType.Parameter("oversizedDataOssTargetArn") String oversizedDataOssTargetArn,
        @CustomType.Parameter("status") Integer status) {
        this.accountId = accountId;
        this.configurationItemChangeNotification = configurationItemChangeNotification;
        this.configurationSnapshot = configurationSnapshot;
        this.deliveryChannelAssumeRoleArn = deliveryChannelAssumeRoleArn;
        this.deliveryChannelCondition = deliveryChannelCondition;
        this.deliveryChannelId = deliveryChannelId;
        this.deliveryChannelName = deliveryChannelName;
        this.deliveryChannelTargetArn = deliveryChannelTargetArn;
        this.deliveryChannelType = deliveryChannelType;
        this.description = description;
        this.id = id;
        this.nonCompliantNotification = nonCompliantNotification;
        this.oversizedDataOssTargetArn = oversizedDataOssTargetArn;
        this.status = status;
    }

    /**
     * @return The Aliyun User Id.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return Open or close delivery configuration change history.
     * 
     */
    public Boolean configurationItemChangeNotification() {
        return this.configurationItemChangeNotification;
    }
    /**
     * @return Open or close timed snapshot of shipping resources.
     * 
     */
    public Boolean configurationSnapshot() {
        return this.configurationSnapshot;
    }
    /**
     * @return The Alibaba Cloud Resource Name (ARN) of the role to be assumed by the delivery method.
     * 
     */
    public String deliveryChannelAssumeRoleArn() {
        return this.deliveryChannelAssumeRoleArn;
    }
    /**
     * @return The rule attached to the delivery method.
     * 
     */
    public String deliveryChannelCondition() {
        return this.deliveryChannelCondition;
    }
    /**
     * @return The ID of the delivery method.
     * 
     */
    public String deliveryChannelId() {
        return this.deliveryChannelId;
    }
    /**
     * @return The name of the delivery method.
     * 
     */
    public String deliveryChannelName() {
        return this.deliveryChannelName;
    }
    /**
     * @return The ARN of the delivery destination.
     * 
     */
    public String deliveryChannelTargetArn() {
        return this.deliveryChannelTargetArn;
    }
    /**
     * @return The type of the delivery method.
     * 
     */
    public String deliveryChannelType() {
        return this.deliveryChannelType;
    }
    /**
     * @return The description of the delivery method.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the Delivery.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Open or close non-compliance events of delivery resources.
     * 
     */
    public Boolean nonCompliantNotification() {
        return this.nonCompliantNotification;
    }
    /**
     * @return The oss ARN of the delivery channel when the value data oversized limit.
     * 
     */
    public String oversizedDataOssTargetArn() {
        return this.oversizedDataOssTargetArn;
    }
    /**
     * @return The status of the delivery method. Valid values: `0`: The delivery method is disabled. `1`: The delivery destination is enabled.
     * 
     */
    public Integer status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeliveriesDelivery defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountId;
        private Boolean configurationItemChangeNotification;
        private Boolean configurationSnapshot;
        private String deliveryChannelAssumeRoleArn;
        private String deliveryChannelCondition;
        private String deliveryChannelId;
        private String deliveryChannelName;
        private String deliveryChannelTargetArn;
        private String deliveryChannelType;
        private String description;
        private String id;
        private Boolean nonCompliantNotification;
        private String oversizedDataOssTargetArn;
        private Integer status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeliveriesDelivery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.configurationItemChangeNotification = defaults.configurationItemChangeNotification;
    	      this.configurationSnapshot = defaults.configurationSnapshot;
    	      this.deliveryChannelAssumeRoleArn = defaults.deliveryChannelAssumeRoleArn;
    	      this.deliveryChannelCondition = defaults.deliveryChannelCondition;
    	      this.deliveryChannelId = defaults.deliveryChannelId;
    	      this.deliveryChannelName = defaults.deliveryChannelName;
    	      this.deliveryChannelTargetArn = defaults.deliveryChannelTargetArn;
    	      this.deliveryChannelType = defaults.deliveryChannelType;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.nonCompliantNotification = defaults.nonCompliantNotification;
    	      this.oversizedDataOssTargetArn = defaults.oversizedDataOssTargetArn;
    	      this.status = defaults.status;
        }

        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        public Builder configurationItemChangeNotification(Boolean configurationItemChangeNotification) {
            this.configurationItemChangeNotification = Objects.requireNonNull(configurationItemChangeNotification);
            return this;
        }
        public Builder configurationSnapshot(Boolean configurationSnapshot) {
            this.configurationSnapshot = Objects.requireNonNull(configurationSnapshot);
            return this;
        }
        public Builder deliveryChannelAssumeRoleArn(String deliveryChannelAssumeRoleArn) {
            this.deliveryChannelAssumeRoleArn = Objects.requireNonNull(deliveryChannelAssumeRoleArn);
            return this;
        }
        public Builder deliveryChannelCondition(String deliveryChannelCondition) {
            this.deliveryChannelCondition = Objects.requireNonNull(deliveryChannelCondition);
            return this;
        }
        public Builder deliveryChannelId(String deliveryChannelId) {
            this.deliveryChannelId = Objects.requireNonNull(deliveryChannelId);
            return this;
        }
        public Builder deliveryChannelName(String deliveryChannelName) {
            this.deliveryChannelName = Objects.requireNonNull(deliveryChannelName);
            return this;
        }
        public Builder deliveryChannelTargetArn(String deliveryChannelTargetArn) {
            this.deliveryChannelTargetArn = Objects.requireNonNull(deliveryChannelTargetArn);
            return this;
        }
        public Builder deliveryChannelType(String deliveryChannelType) {
            this.deliveryChannelType = Objects.requireNonNull(deliveryChannelType);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder nonCompliantNotification(Boolean nonCompliantNotification) {
            this.nonCompliantNotification = Objects.requireNonNull(nonCompliantNotification);
            return this;
        }
        public Builder oversizedDataOssTargetArn(String oversizedDataOssTargetArn) {
            this.oversizedDataOssTargetArn = Objects.requireNonNull(oversizedDataOssTargetArn);
            return this;
        }
        public Builder status(Integer status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GetDeliveriesDelivery build() {
            return new GetDeliveriesDelivery(accountId, configurationItemChangeNotification, configurationSnapshot, deliveryChannelAssumeRoleArn, deliveryChannelCondition, deliveryChannelId, deliveryChannelName, deliveryChannelTargetArn, deliveryChannelType, description, id, nonCompliantNotification, oversizedDataOssTargetArn, status);
        }
    }
}
