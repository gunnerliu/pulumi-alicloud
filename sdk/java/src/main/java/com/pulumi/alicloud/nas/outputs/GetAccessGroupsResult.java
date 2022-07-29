// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nas.outputs;

import com.pulumi.alicloud.nas.outputs.GetAccessGroupsGroup;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAccessGroupsResult {
    /**
     * @return (Available in 1.95.0+) The name of the AccessGroup.
     * 
     */
    private final @Nullable String accessGroupName;
    /**
     * @return (Available in 1.95.0+) The type of the AccessGroup.
     * 
     */
    private final @Nullable String accessGroupType;
    /**
     * @return Description of the AccessGroup.
     * 
     */
    private final @Nullable String description;
    private final @Nullable String fileSystemType;
    /**
     * @return A list of AccessGroups. Each element contains the following attributes:
     * 
     */
    private final List<GetAccessGroupsGroup> groups;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A list of AccessGroup IDs, the value is set to `names`. After version 1.95.0 the item value as `&lt;access_group_id&gt;:&lt;file_system_type&gt;`.
     * 
     */
    private final List<String> ids;
    private final @Nullable String nameRegex;
    /**
     * @return A list of AccessGroup names.
     * 
     */
    private final List<String> names;
    private final @Nullable String outputFile;
    /**
     * @return (Deprecated in v1.95.0+) AccessGroupType of the AccessGroup. The Field replace by `access_group_type` after version 1.95.0.
     * 
     * @deprecated
     * Field &#39;type&#39; has been deprecated from provider version 1.95.0. New field &#39;access_group_type&#39; replaces it.
     * 
     */
    @Deprecated /* Field 'type' has been deprecated from provider version 1.95.0. New field 'access_group_type' replaces it. */
    private final @Nullable String type;
    private final @Nullable Boolean useutcDateTime;

    @CustomType.Constructor
    private GetAccessGroupsResult(
        @CustomType.Parameter("accessGroupName") @Nullable String accessGroupName,
        @CustomType.Parameter("accessGroupType") @Nullable String accessGroupType,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("fileSystemType") @Nullable String fileSystemType,
        @CustomType.Parameter("groups") List<GetAccessGroupsGroup> groups,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("useutcDateTime") @Nullable Boolean useutcDateTime) {
        this.accessGroupName = accessGroupName;
        this.accessGroupType = accessGroupType;
        this.description = description;
        this.fileSystemType = fileSystemType;
        this.groups = groups;
        this.id = id;
        this.ids = ids;
        this.nameRegex = nameRegex;
        this.names = names;
        this.outputFile = outputFile;
        this.type = type;
        this.useutcDateTime = useutcDateTime;
    }

    /**
     * @return (Available in 1.95.0+) The name of the AccessGroup.
     * 
     */
    public Optional<String> accessGroupName() {
        return Optional.ofNullable(this.accessGroupName);
    }
    /**
     * @return (Available in 1.95.0+) The type of the AccessGroup.
     * 
     */
    public Optional<String> accessGroupType() {
        return Optional.ofNullable(this.accessGroupType);
    }
    /**
     * @return Description of the AccessGroup.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> fileSystemType() {
        return Optional.ofNullable(this.fileSystemType);
    }
    /**
     * @return A list of AccessGroups. Each element contains the following attributes:
     * 
     */
    public List<GetAccessGroupsGroup> groups() {
        return this.groups;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of AccessGroup IDs, the value is set to `names`. After version 1.95.0 the item value as `&lt;access_group_id&gt;:&lt;file_system_type&gt;`.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of AccessGroup names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return (Deprecated in v1.95.0+) AccessGroupType of the AccessGroup. The Field replace by `access_group_type` after version 1.95.0.
     * 
     * @deprecated
     * Field &#39;type&#39; has been deprecated from provider version 1.95.0. New field &#39;access_group_type&#39; replaces it.
     * 
     */
    @Deprecated /* Field 'type' has been deprecated from provider version 1.95.0. New field 'access_group_type' replaces it. */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    public Optional<Boolean> useutcDateTime() {
        return Optional.ofNullable(this.useutcDateTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessGroupsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessGroupName;
        private @Nullable String accessGroupType;
        private @Nullable String description;
        private @Nullable String fileSystemType;
        private List<GetAccessGroupsGroup> groups;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String type;
        private @Nullable Boolean useutcDateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessGroupsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessGroupName = defaults.accessGroupName;
    	      this.accessGroupType = defaults.accessGroupType;
    	      this.description = defaults.description;
    	      this.fileSystemType = defaults.fileSystemType;
    	      this.groups = defaults.groups;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.type = defaults.type;
    	      this.useutcDateTime = defaults.useutcDateTime;
        }

        public Builder accessGroupName(@Nullable String accessGroupName) {
            this.accessGroupName = accessGroupName;
            return this;
        }
        public Builder accessGroupType(@Nullable String accessGroupType) {
            this.accessGroupType = accessGroupType;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder fileSystemType(@Nullable String fileSystemType) {
            this.fileSystemType = fileSystemType;
            return this;
        }
        public Builder groups(List<GetAccessGroupsGroup> groups) {
            this.groups = Objects.requireNonNull(groups);
            return this;
        }
        public Builder groups(GetAccessGroupsGroup... groups) {
            return groups(List.of(groups));
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
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder useutcDateTime(@Nullable Boolean useutcDateTime) {
            this.useutcDateTime = useutcDateTime;
            return this;
        }        public GetAccessGroupsResult build() {
            return new GetAccessGroupsResult(accessGroupName, accessGroupType, description, fileSystemType, groups, id, ids, nameRegex, names, outputFile, type, useutcDateTime);
        }
    }
}
