// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gpdb.outputs;

import com.pulumi.alicloud.gpdb.outputs.GetDbInstancePlansPlan;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDbInstancePlansResult {
    private String dbInstanceId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String nameRegex;
    private List<String> names;
    private @Nullable String outputFile;
    private @Nullable String planScheduleType;
    private @Nullable String planType;
    private List<GetDbInstancePlansPlan> plans;
    private @Nullable String status;

    private GetDbInstancePlansResult() {}
    public String dbInstanceId() {
        return this.dbInstanceId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> planScheduleType() {
        return Optional.ofNullable(this.planScheduleType);
    }
    public Optional<String> planType() {
        return Optional.ofNullable(this.planType);
    }
    public List<GetDbInstancePlansPlan> plans() {
        return this.plans;
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDbInstancePlansResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dbInstanceId;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String planScheduleType;
        private @Nullable String planType;
        private List<GetDbInstancePlansPlan> plans;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetDbInstancePlansResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbInstanceId = defaults.dbInstanceId;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.planScheduleType = defaults.planScheduleType;
    	      this.planType = defaults.planType;
    	      this.plans = defaults.plans;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder dbInstanceId(String dbInstanceId) {
            this.dbInstanceId = Objects.requireNonNull(dbInstanceId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder planScheduleType(@Nullable String planScheduleType) {
            this.planScheduleType = planScheduleType;
            return this;
        }
        @CustomType.Setter
        public Builder planType(@Nullable String planType) {
            this.planType = planType;
            return this;
        }
        @CustomType.Setter
        public Builder plans(List<GetDbInstancePlansPlan> plans) {
            this.plans = Objects.requireNonNull(plans);
            return this;
        }
        public Builder plans(GetDbInstancePlansPlan... plans) {
            return plans(List.of(plans));
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public GetDbInstancePlansResult build() {
            final var o = new GetDbInstancePlansResult();
            o.dbInstanceId = dbInstanceId;
            o.id = id;
            o.ids = ids;
            o.nameRegex = nameRegex;
            o.names = names;
            o.outputFile = outputFile;
            o.planScheduleType = planScheduleType;
            o.planType = planType;
            o.plans = plans;
            o.status = status;
            return o;
        }
    }
}
