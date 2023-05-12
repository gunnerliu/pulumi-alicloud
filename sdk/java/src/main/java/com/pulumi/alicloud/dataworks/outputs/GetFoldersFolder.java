// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dataworks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFoldersFolder {
    private final String folderId;
    /**
     * @return Folder Path.
     * 
     */
    private final String folderPath;
    /**
     * @return The Folder ID.
     * 
     */
    private final String id;
    /**
     * @return The ID of the project.
     * 
     */
    private final String projectId;

    @CustomType.Constructor
    private GetFoldersFolder(
        @CustomType.Parameter("folderId") String folderId,
        @CustomType.Parameter("folderPath") String folderPath,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("projectId") String projectId) {
        this.folderId = folderId;
        this.folderPath = folderPath;
        this.id = id;
        this.projectId = projectId;
    }

    public String folderId() {
        return this.folderId;
    }
    /**
     * @return Folder Path.
     * 
     */
    public String folderPath() {
        return this.folderPath;
    }
    /**
     * @return The Folder ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the project.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFoldersFolder defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String folderId;
        private String folderPath;
        private String id;
        private String projectId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFoldersFolder defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.folderId = defaults.folderId;
    	      this.folderPath = defaults.folderPath;
    	      this.id = defaults.id;
    	      this.projectId = defaults.projectId;
        }

        public Builder folderId(String folderId) {
            this.folderId = Objects.requireNonNull(folderId);
            return this;
        }
        public Builder folderPath(String folderPath) {
            this.folderPath = Objects.requireNonNull(folderPath);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }        public GetFoldersFolder build() {
            return new GetFoldersFolder(folderId, folderPath, id, projectId);
        }
    }
}
