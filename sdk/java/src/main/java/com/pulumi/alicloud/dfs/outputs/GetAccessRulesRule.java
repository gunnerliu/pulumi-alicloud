// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dfs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAccessRulesRule {
    /**
     * @return The resource ID of the Access Group.
     * 
     */
    private final String accessGroupId;
    /**
     * @return The ID of the Access Rule.
     * 
     */
    private final String accessRuleId;
    /**
     * @return The created time of the Access Rule.
     * 
     */
    private final String createTime;
    /**
     * @return The description of the Access Rule.
     * 
     */
    private final String description;
    /**
     * @return The resource ID of Access Rule.
     * 
     */
    private final String id;
    /**
     * @return The NetworkSegment of the Access Rule.
     * 
     */
    private final String networkSegment;
    /**
     * @return The priority of the Access Rule.
     * 
     */
    private final Integer priority;
    /**
     * @return RWAccessType of the Access Rule. Valid values: `RDONLY`, `RDWR`.
     * 
     */
    private final String rwAccessType;

    @CustomType.Constructor
    private GetAccessRulesRule(
        @CustomType.Parameter("accessGroupId") String accessGroupId,
        @CustomType.Parameter("accessRuleId") String accessRuleId,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("networkSegment") String networkSegment,
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("rwAccessType") String rwAccessType) {
        this.accessGroupId = accessGroupId;
        this.accessRuleId = accessRuleId;
        this.createTime = createTime;
        this.description = description;
        this.id = id;
        this.networkSegment = networkSegment;
        this.priority = priority;
        this.rwAccessType = rwAccessType;
    }

    /**
     * @return The resource ID of the Access Group.
     * 
     */
    public String accessGroupId() {
        return this.accessGroupId;
    }
    /**
     * @return The ID of the Access Rule.
     * 
     */
    public String accessRuleId() {
        return this.accessRuleId;
    }
    /**
     * @return The created time of the Access Rule.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The description of the Access Rule.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The resource ID of Access Rule.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The NetworkSegment of the Access Rule.
     * 
     */
    public String networkSegment() {
        return this.networkSegment;
    }
    /**
     * @return The priority of the Access Rule.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return RWAccessType of the Access Rule. Valid values: `RDONLY`, `RDWR`.
     * 
     */
    public String rwAccessType() {
        return this.rwAccessType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessRulesRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessGroupId;
        private String accessRuleId;
        private String createTime;
        private String description;
        private String id;
        private String networkSegment;
        private Integer priority;
        private String rwAccessType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessRulesRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessGroupId = defaults.accessGroupId;
    	      this.accessRuleId = defaults.accessRuleId;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.networkSegment = defaults.networkSegment;
    	      this.priority = defaults.priority;
    	      this.rwAccessType = defaults.rwAccessType;
        }

        public Builder accessGroupId(String accessGroupId) {
            this.accessGroupId = Objects.requireNonNull(accessGroupId);
            return this;
        }
        public Builder accessRuleId(String accessRuleId) {
            this.accessRuleId = Objects.requireNonNull(accessRuleId);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
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
        public Builder networkSegment(String networkSegment) {
            this.networkSegment = Objects.requireNonNull(networkSegment);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder rwAccessType(String rwAccessType) {
            this.rwAccessType = Objects.requireNonNull(rwAccessType);
            return this;
        }        public GetAccessRulesRule build() {
            return new GetAccessRulesRule(accessGroupId, accessRuleId, createTime, description, id, networkSegment, priority, rwAccessType);
        }
    }
}
