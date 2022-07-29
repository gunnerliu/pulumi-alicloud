// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dataworks.outputs;

import com.pulumi.alicloud.dataworks.outputs.GetFoldersFolder;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFoldersResult {
    private final List<GetFoldersFolder> folders;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final @Nullable String outputFile;
    private final String parentFolderPath;
    private final String projectId;

    @CustomType.Constructor
    private GetFoldersResult(
        @CustomType.Parameter("folders") List<GetFoldersFolder> folders,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("parentFolderPath") String parentFolderPath,
        @CustomType.Parameter("projectId") String projectId) {
        this.folders = folders;
        this.id = id;
        this.ids = ids;
        this.outputFile = outputFile;
        this.parentFolderPath = parentFolderPath;
        this.projectId = projectId;
    }

    public List<GetFoldersFolder> folders() {
        return this.folders;
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
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public String parentFolderPath() {
        return this.parentFolderPath;
    }
    public String projectId() {
        return this.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFoldersResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetFoldersFolder> folders;
        private String id;
        private List<String> ids;
        private @Nullable String outputFile;
        private String parentFolderPath;
        private String projectId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFoldersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.folders = defaults.folders;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.outputFile = defaults.outputFile;
    	      this.parentFolderPath = defaults.parentFolderPath;
    	      this.projectId = defaults.projectId;
        }

        public Builder folders(List<GetFoldersFolder> folders) {
            this.folders = Objects.requireNonNull(folders);
            return this;
        }
        public Builder folders(GetFoldersFolder... folders) {
            return folders(List.of(folders));
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
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder parentFolderPath(String parentFolderPath) {
            this.parentFolderPath = Objects.requireNonNull(parentFolderPath);
            return this;
        }
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }        public GetFoldersResult build() {
            return new GetFoldersResult(folders, id, ids, outputFile, parentFolderPath, projectId);
        }
    }
}
