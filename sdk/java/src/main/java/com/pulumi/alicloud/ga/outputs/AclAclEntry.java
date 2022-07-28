// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AclAclEntry {
    /**
     * @return The IP entry that you want to add to the ACL.
     * 
     */
    private final @Nullable String entry;
    /**
     * @return The description of the IP entry. The description must be `1` to `256` characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.),and underscores (_).
     * 
     */
    private final @Nullable String entryDescription;

    @CustomType.Constructor
    private AclAclEntry(
        @CustomType.Parameter("entry") @Nullable String entry,
        @CustomType.Parameter("entryDescription") @Nullable String entryDescription) {
        this.entry = entry;
        this.entryDescription = entryDescription;
    }

    /**
     * @return The IP entry that you want to add to the ACL.
     * 
     */
    public Optional<String> entry() {
        return Optional.ofNullable(this.entry);
    }
    /**
     * @return The description of the IP entry. The description must be `1` to `256` characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.),and underscores (_).
     * 
     */
    public Optional<String> entryDescription() {
        return Optional.ofNullable(this.entryDescription);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AclAclEntry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String entry;
        private @Nullable String entryDescription;

        public Builder() {
    	      // Empty
        }

        public Builder(AclAclEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entry = defaults.entry;
    	      this.entryDescription = defaults.entryDescription;
        }

        public Builder entry(@Nullable String entry) {
            this.entry = entry;
            return this;
        }
        public Builder entryDescription(@Nullable String entryDescription) {
            this.entryDescription = entryDescription;
            return this;
        }        public AclAclEntry build() {
            return new AclAclEntry(entry, entryDescription);
        }
    }
}
