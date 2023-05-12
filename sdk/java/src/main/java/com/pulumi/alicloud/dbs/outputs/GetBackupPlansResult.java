// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dbs.outputs;

import com.pulumi.alicloud.dbs.outputs.GetBackupPlansPlan;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBackupPlansResult {
    private final @Nullable String backupPlanName;
    private final @Nullable Boolean enableDetails;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final @Nullable String nameRegex;
    private final List<String> names;
    private final @Nullable String outputFile;
    private final @Nullable Integer pageNumber;
    private final @Nullable Integer pageSize;
    private final List<GetBackupPlansPlan> plans;
    private final @Nullable String status;

    @CustomType.Constructor
    private GetBackupPlansResult(
        @CustomType.Parameter("backupPlanName") @Nullable String backupPlanName,
        @CustomType.Parameter("enableDetails") @Nullable Boolean enableDetails,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("pageNumber") @Nullable Integer pageNumber,
        @CustomType.Parameter("pageSize") @Nullable Integer pageSize,
        @CustomType.Parameter("plans") List<GetBackupPlansPlan> plans,
        @CustomType.Parameter("status") @Nullable String status) {
        this.backupPlanName = backupPlanName;
        this.enableDetails = enableDetails;
        this.id = id;
        this.ids = ids;
        this.nameRegex = nameRegex;
        this.names = names;
        this.outputFile = outputFile;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.plans = plans;
        this.status = status;
    }

    public Optional<String> backupPlanName() {
        return Optional.ofNullable(this.backupPlanName);
    }
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
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
    public Optional<Integer> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }
    public Optional<Integer> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }
    public List<GetBackupPlansPlan> plans() {
        return this.plans;
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupPlansResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupPlanName;
        private @Nullable Boolean enableDetails;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable Integer pageNumber;
        private @Nullable Integer pageSize;
        private List<GetBackupPlansPlan> plans;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupPlansResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupPlanName = defaults.backupPlanName;
    	      this.enableDetails = defaults.enableDetails;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.pageNumber = defaults.pageNumber;
    	      this.pageSize = defaults.pageSize;
    	      this.plans = defaults.plans;
    	      this.status = defaults.status;
        }

        public Builder backupPlanName(@Nullable String backupPlanName) {
            this.backupPlanName = backupPlanName;
            return this;
        }
        public Builder enableDetails(@Nullable Boolean enableDetails) {
            this.enableDetails = enableDetails;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder pageNumber(@Nullable Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Builder pageSize(@Nullable Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Builder plans(List<GetBackupPlansPlan> plans) {
            this.plans = Objects.requireNonNull(plans);
            return this;
        }
        public Builder plans(GetBackupPlansPlan... plans) {
            return plans(List.of(plans));
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public GetBackupPlansResult build() {
            return new GetBackupPlansResult(backupPlanName, enableDetails, id, ids, nameRegex, names, outputFile, pageNumber, pageSize, plans, status);
        }
    }
}
