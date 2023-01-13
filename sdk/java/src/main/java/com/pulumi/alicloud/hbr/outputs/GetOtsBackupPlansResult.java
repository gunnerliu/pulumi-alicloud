// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbr.outputs;

import com.pulumi.alicloud.hbr.outputs.GetOtsBackupPlansPlan;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetOtsBackupPlansResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String nameRegex;
    private List<String> names;
    private @Nullable String outputFile;
    private @Nullable String planId;
    private @Nullable String planName;
    private List<GetOtsBackupPlansPlan> plans;
    private @Nullable String vaultId;

    private GetOtsBackupPlansResult() {}
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
    public Optional<String> planId() {
        return Optional.ofNullable(this.planId);
    }
    public Optional<String> planName() {
        return Optional.ofNullable(this.planName);
    }
    public List<GetOtsBackupPlansPlan> plans() {
        return this.plans;
    }
    public Optional<String> vaultId() {
        return Optional.ofNullable(this.vaultId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOtsBackupPlansResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String planId;
        private @Nullable String planName;
        private List<GetOtsBackupPlansPlan> plans;
        private @Nullable String vaultId;
        public Builder() {}
        public Builder(GetOtsBackupPlansResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.planId = defaults.planId;
    	      this.planName = defaults.planName;
    	      this.plans = defaults.plans;
    	      this.vaultId = defaults.vaultId;
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
        public Builder planId(@Nullable String planId) {
            this.planId = planId;
            return this;
        }
        @CustomType.Setter
        public Builder planName(@Nullable String planName) {
            this.planName = planName;
            return this;
        }
        @CustomType.Setter
        public Builder plans(List<GetOtsBackupPlansPlan> plans) {
            this.plans = Objects.requireNonNull(plans);
            return this;
        }
        public Builder plans(GetOtsBackupPlansPlan... plans) {
            return plans(List.of(plans));
        }
        @CustomType.Setter
        public Builder vaultId(@Nullable String vaultId) {
            this.vaultId = vaultId;
            return this;
        }
        public GetOtsBackupPlansResult build() {
            final var o = new GetOtsBackupPlansResult();
            o.id = id;
            o.ids = ids;
            o.nameRegex = nameRegex;
            o.names = names;
            o.outputFile = outputFile;
            o.planId = planId;
            o.planName = planName;
            o.plans = plans;
            o.vaultId = vaultId;
            return o;
        }
    }
}
