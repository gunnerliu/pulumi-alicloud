// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.outputs;

import com.pulumi.alicloud.cms.outputs.GetDynamicTagGroupsGroupMatchExpress;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDynamicTagGroupsGroup {
    /**
     * @return The ID of the tag rule.
     * 
     */
    private String dynamicTagRuleId;
    /**
     * @return The ID of the Dynamic Tag Group.
     * 
     */
    private String id;
    /**
     * @return The relationship between conditional expressions. Valid values: `and`, `or`.
     * 
     */
    private String matchExpressFilterRelation;
    /**
     * @return The label generates a matching expression that applies the grouping. See the following `Block match_express`.
     * 
     */
    private List<GetDynamicTagGroupsGroupMatchExpress> matchExpresses;
    /**
     * @return The status of the resource. Valid values: `RUNNING`, `FINISH`.
     * 
     */
    private String status;
    /**
     * @return The tag key of the tag.
     * 
     */
    private String tagKey;

    private GetDynamicTagGroupsGroup() {}
    /**
     * @return The ID of the tag rule.
     * 
     */
    public String dynamicTagRuleId() {
        return this.dynamicTagRuleId;
    }
    /**
     * @return The ID of the Dynamic Tag Group.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The relationship between conditional expressions. Valid values: `and`, `or`.
     * 
     */
    public String matchExpressFilterRelation() {
        return this.matchExpressFilterRelation;
    }
    /**
     * @return The label generates a matching expression that applies the grouping. See the following `Block match_express`.
     * 
     */
    public List<GetDynamicTagGroupsGroupMatchExpress> matchExpresses() {
        return this.matchExpresses;
    }
    /**
     * @return The status of the resource. Valid values: `RUNNING`, `FINISH`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The tag key of the tag.
     * 
     */
    public String tagKey() {
        return this.tagKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDynamicTagGroupsGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dynamicTagRuleId;
        private String id;
        private String matchExpressFilterRelation;
        private List<GetDynamicTagGroupsGroupMatchExpress> matchExpresses;
        private String status;
        private String tagKey;
        public Builder() {}
        public Builder(GetDynamicTagGroupsGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dynamicTagRuleId = defaults.dynamicTagRuleId;
    	      this.id = defaults.id;
    	      this.matchExpressFilterRelation = defaults.matchExpressFilterRelation;
    	      this.matchExpresses = defaults.matchExpresses;
    	      this.status = defaults.status;
    	      this.tagKey = defaults.tagKey;
        }

        @CustomType.Setter
        public Builder dynamicTagRuleId(String dynamicTagRuleId) {
            this.dynamicTagRuleId = Objects.requireNonNull(dynamicTagRuleId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder matchExpressFilterRelation(String matchExpressFilterRelation) {
            this.matchExpressFilterRelation = Objects.requireNonNull(matchExpressFilterRelation);
            return this;
        }
        @CustomType.Setter
        public Builder matchExpresses(List<GetDynamicTagGroupsGroupMatchExpress> matchExpresses) {
            this.matchExpresses = Objects.requireNonNull(matchExpresses);
            return this;
        }
        public Builder matchExpresses(GetDynamicTagGroupsGroupMatchExpress... matchExpresses) {
            return matchExpresses(List.of(matchExpresses));
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder tagKey(String tagKey) {
            this.tagKey = Objects.requireNonNull(tagKey);
            return this;
        }
        public GetDynamicTagGroupsGroup build() {
            final var o = new GetDynamicTagGroupsGroup();
            o.dynamicTagRuleId = dynamicTagRuleId;
            o.id = id;
            o.matchExpressFilterRelation = matchExpressFilterRelation;
            o.matchExpresses = matchExpresses;
            o.status = status;
            o.tagKey = tagKey;
            return o;
        }
    }
}
