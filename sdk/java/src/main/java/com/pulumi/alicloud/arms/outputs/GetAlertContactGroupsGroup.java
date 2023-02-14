// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAlertContactGroupsGroup {
    /**
     * @return The first ID of the resource.
     * 
     */
    private String alertContactGroupId;
    /**
     * @return The name of the resource.
     * 
     */
    private String alertContactGroupName;
    /**
     * @return contact ids.
     * 
     */
    private List<String> contactIds;
    /**
     * @return The creation time of the resource.
     * 
     */
    private String createTime;
    /**
     * @return The ID of the Alert Contact Group.
     * 
     */
    private String id;

    private GetAlertContactGroupsGroup() {}
    /**
     * @return The first ID of the resource.
     * 
     */
    public String alertContactGroupId() {
        return this.alertContactGroupId;
    }
    /**
     * @return The name of the resource.
     * 
     */
    public String alertContactGroupName() {
        return this.alertContactGroupName;
    }
    /**
     * @return contact ids.
     * 
     */
    public List<String> contactIds() {
        return this.contactIds;
    }
    /**
     * @return The creation time of the resource.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The ID of the Alert Contact Group.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlertContactGroupsGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String alertContactGroupId;
        private String alertContactGroupName;
        private List<String> contactIds;
        private String createTime;
        private String id;
        public Builder() {}
        public Builder(GetAlertContactGroupsGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertContactGroupId = defaults.alertContactGroupId;
    	      this.alertContactGroupName = defaults.alertContactGroupName;
    	      this.contactIds = defaults.contactIds;
    	      this.createTime = defaults.createTime;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder alertContactGroupId(String alertContactGroupId) {
            this.alertContactGroupId = Objects.requireNonNull(alertContactGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder alertContactGroupName(String alertContactGroupName) {
            this.alertContactGroupName = Objects.requireNonNull(alertContactGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder contactIds(List<String> contactIds) {
            this.contactIds = Objects.requireNonNull(contactIds);
            return this;
        }
        public Builder contactIds(String... contactIds) {
            return contactIds(List.of(contactIds));
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetAlertContactGroupsGroup build() {
            final var o = new GetAlertContactGroupsGroup();
            o.alertContactGroupId = alertContactGroupId;
            o.alertContactGroupName = alertContactGroupName;
            o.contactIds = contactIds;
            o.createTime = createTime;
            o.id = id;
            return o;
        }
    }
}