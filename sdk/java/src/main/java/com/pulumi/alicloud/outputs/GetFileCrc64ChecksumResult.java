// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFileCrc64ChecksumResult {
    /**
     * @return the file checksum of crc64.
     * 
     */
    private String checksum;
    private String filename;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String outputFile;

    private GetFileCrc64ChecksumResult() {}
    /**
     * @return the file checksum of crc64.
     * 
     */
    public String checksum() {
        return this.checksum;
    }
    public String filename() {
        return this.filename;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFileCrc64ChecksumResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String checksum;
        private String filename;
        private String id;
        private @Nullable String outputFile;
        public Builder() {}
        public Builder(GetFileCrc64ChecksumResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checksum = defaults.checksum;
    	      this.filename = defaults.filename;
    	      this.id = defaults.id;
    	      this.outputFile = defaults.outputFile;
        }

        @CustomType.Setter
        public Builder checksum(String checksum) {
            this.checksum = Objects.requireNonNull(checksum);
            return this;
        }
        @CustomType.Setter
        public Builder filename(String filename) {
            this.filename = Objects.requireNonNull(filename);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public GetFileCrc64ChecksumResult build() {
            final var o = new GetFileCrc64ChecksumResult();
            o.checksum = checksum;
            o.filename = filename;
            o.id = id;
            o.outputFile = outputFile;
            return o;
        }
    }
}
