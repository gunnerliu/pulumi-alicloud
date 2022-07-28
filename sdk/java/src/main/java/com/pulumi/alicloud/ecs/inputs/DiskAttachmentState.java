// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DiskAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final DiskAttachmentState Empty = new DiskAttachmentState();

    @Import(name="bootable")
    private @Nullable Output<Boolean> bootable;

    public Optional<Output<Boolean>> bootable() {
        return Optional.ofNullable(this.bootable);
    }

    @Import(name="deleteWithInstance")
    private @Nullable Output<Boolean> deleteWithInstance;

    public Optional<Output<Boolean>> deleteWithInstance() {
        return Optional.ofNullable(this.deleteWithInstance);
    }

    @Import(name="device")
    private @Nullable Output<String> device;

    public Optional<Output<String>> device() {
        return Optional.ofNullable(this.device);
    }

    /**
     * ID of the Disk to be attached.
     * 
     */
    @Import(name="diskId")
    private @Nullable Output<String> diskId;

    /**
     * @return ID of the Disk to be attached.
     * 
     */
    public Optional<Output<String>> diskId() {
        return Optional.ofNullable(this.diskId);
    }

    /**
     * ID of the Instance to attach to.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return ID of the Instance to attach to.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    @Import(name="keyPairName")
    private @Nullable Output<String> keyPairName;

    public Optional<Output<String>> keyPairName() {
        return Optional.ofNullable(this.keyPairName);
    }

    @Import(name="password")
    private @Nullable Output<String> password;

    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    private DiskAttachmentState() {}

    private DiskAttachmentState(DiskAttachmentState $) {
        this.bootable = $.bootable;
        this.deleteWithInstance = $.deleteWithInstance;
        this.device = $.device;
        this.diskId = $.diskId;
        this.instanceId = $.instanceId;
        this.keyPairName = $.keyPairName;
        this.password = $.password;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskAttachmentState $;

        public Builder() {
            $ = new DiskAttachmentState();
        }

        public Builder(DiskAttachmentState defaults) {
            $ = new DiskAttachmentState(Objects.requireNonNull(defaults));
        }

        public Builder bootable(@Nullable Output<Boolean> bootable) {
            $.bootable = bootable;
            return this;
        }

        public Builder bootable(Boolean bootable) {
            return bootable(Output.of(bootable));
        }

        public Builder deleteWithInstance(@Nullable Output<Boolean> deleteWithInstance) {
            $.deleteWithInstance = deleteWithInstance;
            return this;
        }

        public Builder deleteWithInstance(Boolean deleteWithInstance) {
            return deleteWithInstance(Output.of(deleteWithInstance));
        }

        public Builder device(@Nullable Output<String> device) {
            $.device = device;
            return this;
        }

        public Builder device(String device) {
            return device(Output.of(device));
        }

        /**
         * @param diskId ID of the Disk to be attached.
         * 
         * @return builder
         * 
         */
        public Builder diskId(@Nullable Output<String> diskId) {
            $.diskId = diskId;
            return this;
        }

        /**
         * @param diskId ID of the Disk to be attached.
         * 
         * @return builder
         * 
         */
        public Builder diskId(String diskId) {
            return diskId(Output.of(diskId));
        }

        /**
         * @param instanceId ID of the Instance to attach to.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId ID of the Instance to attach to.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        public Builder keyPairName(@Nullable Output<String> keyPairName) {
            $.keyPairName = keyPairName;
            return this;
        }

        public Builder keyPairName(String keyPairName) {
            return keyPairName(Output.of(keyPairName));
        }

        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        public DiskAttachmentState build() {
            return $;
        }
    }

}
