// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetImagesArgs Empty = new GetImagesArgs();

    /**
     * The scenario in which the image will be used. Default value: `CreateEcs`. Valid values:
     * 
     */
    @Import(name="actionType")
    private @Nullable Output<String> actionType;

    /**
     * @return The scenario in which the image will be used. Default value: `CreateEcs`. Valid values:
     * 
     */
    public Optional<Output<String>> actionType() {
        return Optional.ofNullable(this.actionType);
    }

    /**
     * The image architecture. Valid values: `i386` and `x86_64`.
     * 
     */
    @Import(name="architecture")
    private @Nullable Output<String> architecture;

    /**
     * @return The image architecture. Valid values: `i386` and `x86_64`.
     * 
     */
    public Optional<Output<String>> architecture() {
        return Optional.ofNullable(this.architecture);
    }

    /**
     * Specifies whether the image is running on an ECS instance. Default value: `false`. Valid values:
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return Specifies whether the image is running on an ECS instance. Default value: `false`. Valid values:
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * The name of the image family. You can set this parameter to query images of the specified image family. This parameter is empty by default.
     * 
     */
    @Import(name="imageFamily")
    private @Nullable Output<String> imageFamily;

    /**
     * @return The name of the image family. You can set this parameter to query images of the specified image family. This parameter is empty by default.
     * 
     */
    public Optional<Output<String>> imageFamily() {
        return Optional.ofNullable(this.imageFamily);
    }

    /**
     * The ID of the image.
     * 
     */
    @Import(name="imageId")
    private @Nullable Output<String> imageId;

    /**
     * @return The ID of the image.
     * 
     */
    public Optional<Output<String>> imageId() {
        return Optional.ofNullable(this.imageId);
    }

    /**
     * The name of the image.
     * 
     */
    @Import(name="imageName")
    private @Nullable Output<String> imageName;

    /**
     * @return The name of the image.
     * 
     */
    public Optional<Output<String>> imageName() {
        return Optional.ofNullable(this.imageName);
    }

    /**
     * The ID of the Alibaba Cloud account to which the image belongs. This parameter takes effect only when you query shared images or community images.
     * 
     */
    @Import(name="imageOwnerId")
    private @Nullable Output<String> imageOwnerId;

    /**
     * @return The ID of the Alibaba Cloud account to which the image belongs. This parameter takes effect only when you query shared images or community images.
     * 
     */
    public Optional<Output<String>> imageOwnerId() {
        return Optional.ofNullable(this.imageOwnerId);
    }

    /**
     * The instance type for which the image can be used.
     * 
     */
    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    /**
     * @return The instance type for which the image can be used.
     * 
     */
    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * Specifies whether the image supports cloud-init.
     * 
     */
    @Import(name="isSupportCloudInit")
    private @Nullable Output<Boolean> isSupportCloudInit;

    /**
     * @return Specifies whether the image supports cloud-init.
     * 
     */
    public Optional<Output<Boolean>> isSupportCloudInit() {
        return Optional.ofNullable(this.isSupportCloudInit);
    }

    /**
     * Specifies whether the image can be used on I/O optimized instances.
     * 
     */
    @Import(name="isSupportIoOptimized")
    private @Nullable Output<Boolean> isSupportIoOptimized;

    /**
     * @return Specifies whether the image can be used on I/O optimized instances.
     * 
     */
    public Optional<Output<Boolean>> isSupportIoOptimized() {
        return Optional.ofNullable(this.isSupportIoOptimized);
    }

    /**
     * If more than one result are returned, select the most recent one.
     * 
     */
    @Import(name="mostRecent")
    private @Nullable Output<Boolean> mostRecent;

    /**
     * @return If more than one result are returned, select the most recent one.
     * 
     */
    public Optional<Output<Boolean>> mostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }

    /**
     * A regex string to filter resulting images by name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter resulting images by name.
     * 
     */
    public Optional<Output<String>> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * The operating system type of the image. Valid values: `windows` and `linux`.
     * 
     */
    @Import(name="osType")
    private @Nullable Output<String> osType;

    /**
     * @return The operating system type of the image. Valid values: `windows` and `linux`.
     * 
     */
    public Optional<Output<String>> osType() {
        return Optional.ofNullable(this.osType);
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * Filter results by a specific image owner. Valid items are `system`, `self`, `others`, `marketplace`.
     * 
     */
    @Import(name="owners")
    private @Nullable Output<String> owners;

    /**
     * @return Filter results by a specific image owner. Valid items are `system`, `self`, `others`, `marketplace`.
     * 
     */
    public Optional<Output<String>> owners() {
        return Optional.ofNullable(this.owners);
    }

    /**
     * The ID of the resource group to which the custom image belongs.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group to which the custom image belongs.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The ID of the snapshot used to create the custom image.
     * 
     */
    @Import(name="snapshotId")
    private @Nullable Output<String> snapshotId;

    /**
     * @return The ID of the snapshot used to create the custom image.
     * 
     */
    public Optional<Output<String>> snapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }

    /**
     * The status of the image. The following values are available, Separate multiple parameter values by using commas (,). Default value: `Available`. Valid values:
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the image. The following values are available, Separate multiple parameter values by using commas (,). Default value: `Available`. Valid values:
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Specifies whether to check the validity of the request without actually making the request. Valid values:
     * 
     */
    @Import(name="usage")
    private @Nullable Output<String> usage;

    /**
     * @return Specifies whether to check the validity of the request without actually making the request. Valid values:
     * 
     */
    public Optional<Output<String>> usage() {
        return Optional.ofNullable(this.usage);
    }

    private GetImagesArgs() {}

    private GetImagesArgs(GetImagesArgs $) {
        this.actionType = $.actionType;
        this.architecture = $.architecture;
        this.dryRun = $.dryRun;
        this.imageFamily = $.imageFamily;
        this.imageId = $.imageId;
        this.imageName = $.imageName;
        this.imageOwnerId = $.imageOwnerId;
        this.instanceType = $.instanceType;
        this.isSupportCloudInit = $.isSupportCloudInit;
        this.isSupportIoOptimized = $.isSupportIoOptimized;
        this.mostRecent = $.mostRecent;
        this.nameRegex = $.nameRegex;
        this.osType = $.osType;
        this.outputFile = $.outputFile;
        this.owners = $.owners;
        this.resourceGroupId = $.resourceGroupId;
        this.snapshotId = $.snapshotId;
        this.status = $.status;
        this.tags = $.tags;
        this.usage = $.usage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagesArgs $;

        public Builder() {
            $ = new GetImagesArgs();
        }

        public Builder(GetImagesArgs defaults) {
            $ = new GetImagesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionType The scenario in which the image will be used. Default value: `CreateEcs`. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder actionType(@Nullable Output<String> actionType) {
            $.actionType = actionType;
            return this;
        }

        /**
         * @param actionType The scenario in which the image will be used. Default value: `CreateEcs`. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder actionType(String actionType) {
            return actionType(Output.of(actionType));
        }

        /**
         * @param architecture The image architecture. Valid values: `i386` and `x86_64`.
         * 
         * @return builder
         * 
         */
        public Builder architecture(@Nullable Output<String> architecture) {
            $.architecture = architecture;
            return this;
        }

        /**
         * @param architecture The image architecture. Valid values: `i386` and `x86_64`.
         * 
         * @return builder
         * 
         */
        public Builder architecture(String architecture) {
            return architecture(Output.of(architecture));
        }

        /**
         * @param dryRun Specifies whether the image is running on an ECS instance. Default value: `false`. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun Specifies whether the image is running on an ECS instance. Default value: `false`. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param imageFamily The name of the image family. You can set this parameter to query images of the specified image family. This parameter is empty by default.
         * 
         * @return builder
         * 
         */
        public Builder imageFamily(@Nullable Output<String> imageFamily) {
            $.imageFamily = imageFamily;
            return this;
        }

        /**
         * @param imageFamily The name of the image family. You can set this parameter to query images of the specified image family. This parameter is empty by default.
         * 
         * @return builder
         * 
         */
        public Builder imageFamily(String imageFamily) {
            return imageFamily(Output.of(imageFamily));
        }

        /**
         * @param imageId The ID of the image.
         * 
         * @return builder
         * 
         */
        public Builder imageId(@Nullable Output<String> imageId) {
            $.imageId = imageId;
            return this;
        }

        /**
         * @param imageId The ID of the image.
         * 
         * @return builder
         * 
         */
        public Builder imageId(String imageId) {
            return imageId(Output.of(imageId));
        }

        /**
         * @param imageName The name of the image.
         * 
         * @return builder
         * 
         */
        public Builder imageName(@Nullable Output<String> imageName) {
            $.imageName = imageName;
            return this;
        }

        /**
         * @param imageName The name of the image.
         * 
         * @return builder
         * 
         */
        public Builder imageName(String imageName) {
            return imageName(Output.of(imageName));
        }

        /**
         * @param imageOwnerId The ID of the Alibaba Cloud account to which the image belongs. This parameter takes effect only when you query shared images or community images.
         * 
         * @return builder
         * 
         */
        public Builder imageOwnerId(@Nullable Output<String> imageOwnerId) {
            $.imageOwnerId = imageOwnerId;
            return this;
        }

        /**
         * @param imageOwnerId The ID of the Alibaba Cloud account to which the image belongs. This parameter takes effect only when you query shared images or community images.
         * 
         * @return builder
         * 
         */
        public Builder imageOwnerId(String imageOwnerId) {
            return imageOwnerId(Output.of(imageOwnerId));
        }

        /**
         * @param instanceType The instance type for which the image can be used.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType The instance type for which the image can be used.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param isSupportCloudInit Specifies whether the image supports cloud-init.
         * 
         * @return builder
         * 
         */
        public Builder isSupportCloudInit(@Nullable Output<Boolean> isSupportCloudInit) {
            $.isSupportCloudInit = isSupportCloudInit;
            return this;
        }

        /**
         * @param isSupportCloudInit Specifies whether the image supports cloud-init.
         * 
         * @return builder
         * 
         */
        public Builder isSupportCloudInit(Boolean isSupportCloudInit) {
            return isSupportCloudInit(Output.of(isSupportCloudInit));
        }

        /**
         * @param isSupportIoOptimized Specifies whether the image can be used on I/O optimized instances.
         * 
         * @return builder
         * 
         */
        public Builder isSupportIoOptimized(@Nullable Output<Boolean> isSupportIoOptimized) {
            $.isSupportIoOptimized = isSupportIoOptimized;
            return this;
        }

        /**
         * @param isSupportIoOptimized Specifies whether the image can be used on I/O optimized instances.
         * 
         * @return builder
         * 
         */
        public Builder isSupportIoOptimized(Boolean isSupportIoOptimized) {
            return isSupportIoOptimized(Output.of(isSupportIoOptimized));
        }

        /**
         * @param mostRecent If more than one result are returned, select the most recent one.
         * 
         * @return builder
         * 
         */
        public Builder mostRecent(@Nullable Output<Boolean> mostRecent) {
            $.mostRecent = mostRecent;
            return this;
        }

        /**
         * @param mostRecent If more than one result are returned, select the most recent one.
         * 
         * @return builder
         * 
         */
        public Builder mostRecent(Boolean mostRecent) {
            return mostRecent(Output.of(mostRecent));
        }

        /**
         * @param nameRegex A regex string to filter resulting images by name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter resulting images by name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(String nameRegex) {
            return nameRegex(Output.of(nameRegex));
        }

        /**
         * @param osType The operating system type of the image. Valid values: `windows` and `linux`.
         * 
         * @return builder
         * 
         */
        public Builder osType(@Nullable Output<String> osType) {
            $.osType = osType;
            return this;
        }

        /**
         * @param osType The operating system type of the image. Valid values: `windows` and `linux`.
         * 
         * @return builder
         * 
         */
        public Builder osType(String osType) {
            return osType(Output.of(osType));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param owners Filter results by a specific image owner. Valid items are `system`, `self`, `others`, `marketplace`.
         * 
         * @return builder
         * 
         */
        public Builder owners(@Nullable Output<String> owners) {
            $.owners = owners;
            return this;
        }

        /**
         * @param owners Filter results by a specific image owner. Valid items are `system`, `self`, `others`, `marketplace`.
         * 
         * @return builder
         * 
         */
        public Builder owners(String owners) {
            return owners(Output.of(owners));
        }

        /**
         * @param resourceGroupId The ID of the resource group to which the custom image belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The ID of the resource group to which the custom image belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param snapshotId The ID of the snapshot used to create the custom image.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(@Nullable Output<String> snapshotId) {
            $.snapshotId = snapshotId;
            return this;
        }

        /**
         * @param snapshotId The ID of the snapshot used to create the custom image.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(String snapshotId) {
            return snapshotId(Output.of(snapshotId));
        }

        /**
         * @param status The status of the image. The following values are available, Separate multiple parameter values by using commas (,). Default value: `Available`. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the image. The following values are available, Separate multiple parameter values by using commas (,). Default value: `Available`. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param usage Specifies whether to check the validity of the request without actually making the request. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder usage(@Nullable Output<String> usage) {
            $.usage = usage;
            return this;
        }

        /**
         * @param usage Specifies whether to check the validity of the request without actually making the request. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder usage(String usage) {
            return usage(Output.of(usage));
        }

        public GetImagesArgs build() {
            return $;
        }
    }

}
