// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDispatchRulesRuleNotifyRuleNotifyObject {
    /**
     * @return The name of the contact or contact group.
     * 
     */
    private final String name;
    /**
     * @return The ID of the contact or contact group.
     * 
     */
    private final String notifyObjectId;
    /**
     * @return The type of the alert contact.
     * 
     */
    private final String notifyType;

    @CustomType.Constructor
    private GetDispatchRulesRuleNotifyRuleNotifyObject(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("notifyObjectId") String notifyObjectId,
        @CustomType.Parameter("notifyType") String notifyType) {
        this.name = name;
        this.notifyObjectId = notifyObjectId;
        this.notifyType = notifyType;
    }

    /**
     * @return The name of the contact or contact group.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The ID of the contact or contact group.
     * 
     */
    public String notifyObjectId() {
        return this.notifyObjectId;
    }
    /**
     * @return The type of the alert contact.
     * 
     */
    public String notifyType() {
        return this.notifyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDispatchRulesRuleNotifyRuleNotifyObject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String notifyObjectId;
        private String notifyType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDispatchRulesRuleNotifyRuleNotifyObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.notifyObjectId = defaults.notifyObjectId;
    	      this.notifyType = defaults.notifyType;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder notifyObjectId(String notifyObjectId) {
            this.notifyObjectId = Objects.requireNonNull(notifyObjectId);
            return this;
        }
        public Builder notifyType(String notifyType) {
            this.notifyType = Objects.requireNonNull(notifyType);
            return this;
        }        public GetDispatchRulesRuleNotifyRuleNotifyObject build() {
            return new GetDispatchRulesRuleNotifyRuleNotifyObject(name, notifyObjectId, notifyType);
        }
    }
}
