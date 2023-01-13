// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.bastionhost.outputs;

import com.pulumi.alicloud.bastionhost.outputs.GetUsersUser;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetUsersResult {
    private @Nullable String displayName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private String instanceId;
    private @Nullable String mobile;
    private @Nullable String nameRegex;
    private List<String> names;
    private @Nullable String outputFile;
    private @Nullable String source;
    private @Nullable String sourceUserId;
    private @Nullable String status;
    private @Nullable String userName;
    private List<GetUsersUser> users;

    private GetUsersResult() {}
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
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
    public String instanceId() {
        return this.instanceId;
    }
    public Optional<String> mobile() {
        return Optional.ofNullable(this.mobile);
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
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }
    public Optional<String> sourceUserId() {
        return Optional.ofNullable(this.sourceUserId);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    public Optional<String> userName() {
        return Optional.ofNullable(this.userName);
    }
    public List<GetUsersUser> users() {
        return this.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUsersResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String displayName;
        private String id;
        private List<String> ids;
        private String instanceId;
        private @Nullable String mobile;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String source;
        private @Nullable String sourceUserId;
        private @Nullable String status;
        private @Nullable String userName;
        private List<GetUsersUser> users;
        public Builder() {}
        public Builder(GetUsersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceId = defaults.instanceId;
    	      this.mobile = defaults.mobile;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.source = defaults.source;
    	      this.sourceUserId = defaults.sourceUserId;
    	      this.status = defaults.status;
    	      this.userName = defaults.userName;
    	      this.users = defaults.users;
        }

        @CustomType.Setter
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
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
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        @CustomType.Setter
        public Builder mobile(@Nullable String mobile) {
            this.mobile = mobile;
            return this;
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
        public Builder source(@Nullable String source) {
            this.source = source;
            return this;
        }
        @CustomType.Setter
        public Builder sourceUserId(@Nullable String sourceUserId) {
            this.sourceUserId = sourceUserId;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder userName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }
        @CustomType.Setter
        public Builder users(List<GetUsersUser> users) {
            this.users = Objects.requireNonNull(users);
            return this;
        }
        public Builder users(GetUsersUser... users) {
            return users(List.of(users));
        }
        public GetUsersResult build() {
            final var o = new GetUsersResult();
            o.displayName = displayName;
            o.id = id;
            o.ids = ids;
            o.instanceId = instanceId;
            o.mobile = mobile;
            o.nameRegex = nameRegex;
            o.names = names;
            o.outputFile = outputFile;
            o.source = source;
            o.sourceUserId = sourceUserId;
            o.status = status;
            o.userName = userName;
            o.users = users;
            return o;
        }
    }
}
