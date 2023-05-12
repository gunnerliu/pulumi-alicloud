// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.bp.outputs;

import com.pulumi.alicloud.bp.outputs.GetStudioApplicationsApplication;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetStudioApplicationsResult {
    /**
     * @return A list of Cloud Architect Design Tools (BPStudio) Applications. Each element contains the following attributes:
     * 
     */
    private final List<GetStudioApplicationsApplication> applications;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final @Nullable String keyword;
    private final @Nullable Integer maxResults;
    private final @Nullable String nameRegex;
    /**
     * @return A list of Application names.
     * 
     */
    private final List<String> names;
    private final @Nullable Integer orderType;
    private final @Nullable String outputFile;
    /**
     * @return The ID of the resource group.
     * 
     */
    private final @Nullable String resourceGroupId;
    /**
     * @return The status of the Application.
     * 
     */
    private final @Nullable String status;

    @CustomType.Constructor
    private GetStudioApplicationsResult(
        @CustomType.Parameter("applications") List<GetStudioApplicationsApplication> applications,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("keyword") @Nullable String keyword,
        @CustomType.Parameter("maxResults") @Nullable Integer maxResults,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("orderType") @Nullable Integer orderType,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("resourceGroupId") @Nullable String resourceGroupId,
        @CustomType.Parameter("status") @Nullable String status) {
        this.applications = applications;
        this.id = id;
        this.ids = ids;
        this.keyword = keyword;
        this.maxResults = maxResults;
        this.nameRegex = nameRegex;
        this.names = names;
        this.orderType = orderType;
        this.outputFile = outputFile;
        this.resourceGroupId = resourceGroupId;
        this.status = status;
    }

    /**
     * @return A list of Cloud Architect Design Tools (BPStudio) Applications. Each element contains the following attributes:
     * 
     */
    public List<GetStudioApplicationsApplication> applications() {
        return this.applications;
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
    public Optional<String> keyword() {
        return Optional.ofNullable(this.keyword);
    }
    public Optional<Integer> maxResults() {
        return Optional.ofNullable(this.maxResults);
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of Application names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<Integer> orderType() {
        return Optional.ofNullable(this.orderType);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return The ID of the resource group.
     * 
     */
    public Optional<String> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }
    /**
     * @return The status of the Application.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStudioApplicationsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetStudioApplicationsApplication> applications;
        private String id;
        private List<String> ids;
        private @Nullable String keyword;
        private @Nullable Integer maxResults;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable Integer orderType;
        private @Nullable String outputFile;
        private @Nullable String resourceGroupId;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStudioApplicationsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applications = defaults.applications;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.keyword = defaults.keyword;
    	      this.maxResults = defaults.maxResults;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.orderType = defaults.orderType;
    	      this.outputFile = defaults.outputFile;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.status = defaults.status;
        }

        public Builder applications(List<GetStudioApplicationsApplication> applications) {
            this.applications = Objects.requireNonNull(applications);
            return this;
        }
        public Builder applications(GetStudioApplicationsApplication... applications) {
            return applications(List.of(applications));
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
        public Builder keyword(@Nullable String keyword) {
            this.keyword = keyword;
            return this;
        }
        public Builder maxResults(@Nullable Integer maxResults) {
            this.maxResults = maxResults;
            return this;
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
        public Builder orderType(@Nullable Integer orderType) {
            this.orderType = orderType;
            return this;
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder resourceGroupId(@Nullable String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public GetStudioApplicationsResult build() {
            return new GetStudioApplicationsResult(applications, id, ids, keyword, maxResults, nameRegex, names, orderType, outputFile, resourceGroupId, status);
        }
    }
}
