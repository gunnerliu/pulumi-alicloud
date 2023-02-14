// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds.outputs;

import com.pulumi.alicloud.rds.outputs.GetRdsParameterGroupsGroupParamDetail;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRdsParameterGroupsGroup {
    private String engine;
    private String engineVersion;
    private Integer forceRestart;
    private String id;
    private Integer paramCounts;
    private List<GetRdsParameterGroupsGroupParamDetail> paramDetails;
    private String parameterGroupDesc;
    private String parameterGroupId;
    private String parameterGroupName;
    private Integer parameterGroupType;

    private GetRdsParameterGroupsGroup() {}
    public String engine() {
        return this.engine;
    }
    public String engineVersion() {
        return this.engineVersion;
    }
    public Integer forceRestart() {
        return this.forceRestart;
    }
    public String id() {
        return this.id;
    }
    public Integer paramCounts() {
        return this.paramCounts;
    }
    public List<GetRdsParameterGroupsGroupParamDetail> paramDetails() {
        return this.paramDetails;
    }
    public String parameterGroupDesc() {
        return this.parameterGroupDesc;
    }
    public String parameterGroupId() {
        return this.parameterGroupId;
    }
    public String parameterGroupName() {
        return this.parameterGroupName;
    }
    public Integer parameterGroupType() {
        return this.parameterGroupType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRdsParameterGroupsGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String engine;
        private String engineVersion;
        private Integer forceRestart;
        private String id;
        private Integer paramCounts;
        private List<GetRdsParameterGroupsGroupParamDetail> paramDetails;
        private String parameterGroupDesc;
        private String parameterGroupId;
        private String parameterGroupName;
        private Integer parameterGroupType;
        public Builder() {}
        public Builder(GetRdsParameterGroupsGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.forceRestart = defaults.forceRestart;
    	      this.id = defaults.id;
    	      this.paramCounts = defaults.paramCounts;
    	      this.paramDetails = defaults.paramDetails;
    	      this.parameterGroupDesc = defaults.parameterGroupDesc;
    	      this.parameterGroupId = defaults.parameterGroupId;
    	      this.parameterGroupName = defaults.parameterGroupName;
    	      this.parameterGroupType = defaults.parameterGroupType;
        }

        @CustomType.Setter
        public Builder engine(String engine) {
            this.engine = Objects.requireNonNull(engine);
            return this;
        }
        @CustomType.Setter
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = Objects.requireNonNull(engineVersion);
            return this;
        }
        @CustomType.Setter
        public Builder forceRestart(Integer forceRestart) {
            this.forceRestart = Objects.requireNonNull(forceRestart);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder paramCounts(Integer paramCounts) {
            this.paramCounts = Objects.requireNonNull(paramCounts);
            return this;
        }
        @CustomType.Setter
        public Builder paramDetails(List<GetRdsParameterGroupsGroupParamDetail> paramDetails) {
            this.paramDetails = Objects.requireNonNull(paramDetails);
            return this;
        }
        public Builder paramDetails(GetRdsParameterGroupsGroupParamDetail... paramDetails) {
            return paramDetails(List.of(paramDetails));
        }
        @CustomType.Setter
        public Builder parameterGroupDesc(String parameterGroupDesc) {
            this.parameterGroupDesc = Objects.requireNonNull(parameterGroupDesc);
            return this;
        }
        @CustomType.Setter
        public Builder parameterGroupId(String parameterGroupId) {
            this.parameterGroupId = Objects.requireNonNull(parameterGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder parameterGroupName(String parameterGroupName) {
            this.parameterGroupName = Objects.requireNonNull(parameterGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder parameterGroupType(Integer parameterGroupType) {
            this.parameterGroupType = Objects.requireNonNull(parameterGroupType);
            return this;
        }
        public GetRdsParameterGroupsGroup build() {
            final var o = new GetRdsParameterGroupsGroup();
            o.engine = engine;
            o.engineVersion = engineVersion;
            o.forceRestart = forceRestart;
            o.id = id;
            o.paramCounts = paramCounts;
            o.paramDetails = paramDetails;
            o.parameterGroupDesc = parameterGroupDesc;
            o.parameterGroupId = parameterGroupId;
            o.parameterGroupName = parameterGroupName;
            o.parameterGroupType = parameterGroupType;
            return o;
        }
    }
}