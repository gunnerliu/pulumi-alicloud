// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Cloud Storage Gateway Express Sync Share Attachment resource.
 *
 * For information about Cloud Storage Gateway Express Sync Share Attachment and how to use it, see [What is Express Sync Share Attachment](https://www.alibabacloud.com/help/en/doc-detail/53972.htm).
 *
 * > **NOTE:** Available in v1.144.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "tftest";
 * const region = config.get("region") || "cn-shanghai";
 * const defaultStocks = alicloud.cloudstoragegateway.getStocks({
 *     gatewayClass: "Standard",
 * });
 * const vpc = new alicloud.vpc.Network("vpc", {
 *     vpcName: name,
 *     cidrBlock: "192.16.0.0/12",
 * });
 * const defaultSwitch = new alicloud.vpc.Switch("defaultSwitch", {
 *     vpcId: vpc.id,
 *     cidrBlock: "192.16.0.0/21",
 *     zoneId: defaultStocks.then(defaultStocks => defaultStocks.stocks?[0]?.zoneId),
 *     vswitchName: name,
 * });
 * const defaultStorageBundle = new alicloud.cloudstoragegateway.StorageBundle("defaultStorageBundle", {storageBundleName: name});
 * const defaultGateway = new alicloud.cloudstoragegateway.Gateway("defaultGateway", {
 *     description: "tf-acctestDesalone",
 *     gatewayClass: "Standard",
 *     type: "File",
 *     paymentType: "PayAsYouGo",
 *     vswitchId: defaultSwitch.id,
 *     releaseAfterExpiration: true,
 *     publicNetworkBandwidth: 10,
 *     storageBundleId: defaultStorageBundle.id,
 *     location: "Cloud",
 *     gatewayName: name,
 * });
 * const defaultGatewayCacheDisk = new alicloud.cloudstoragegateway.GatewayCacheDisk("defaultGatewayCacheDisk", {
 *     cacheDiskCategory: "cloud_efficiency",
 *     gatewayId: defaultGateway.id,
 *     cacheDiskSizeInGb: 50,
 * });
 * const defaultBucket = new alicloud.oss.Bucket("defaultBucket", {bucket: name});
 * const defaultGatewayFileShare = new alicloud.cloudstoragegateway.GatewayFileShare("defaultGatewayFileShare", {
 *     gatewayFileShareName: name,
 *     gatewayId: defaultGateway.id,
 *     localPath: defaultGatewayCacheDisk.localFilePath,
 *     ossBucketName: defaultBucket.bucket,
 *     ossEndpoint: defaultBucket.extranetEndpoint,
 *     protocol: "NFS",
 *     remoteSync: false,
 *     feLimit: 0,
 *     backendLimit: 0,
 *     cacheMode: "Cache",
 *     squash: "none",
 *     lagPeriod: 5,
 * });
 * const defaultExpressSync = new alicloud.cloudstoragegateway.ExpressSync("defaultExpressSync", {
 *     bucketName: defaultGatewayFileShare.ossBucketName,
 *     bucketRegion: region,
 *     description: name,
 *     expressSyncName: name,
 * });
 * const defaultExpressSyncShareAttachment = new alicloud.cloudstoragegateway.ExpressSyncShareAttachment("defaultExpressSyncShareAttachment", {
 *     expressSyncId: defaultExpressSync.id,
 *     gatewayId: defaultGateway.id,
 *     shareName: defaultGatewayFileShare.gatewayFileShareName,
 * });
 * ```
 *
 * ## Import
 *
 * Cloud Storage Gateway Express Sync Share Attachment can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:cloudstoragegateway/expressSyncShareAttachment:ExpressSyncShareAttachment example <express_sync_id>:<gateway_id>:<share_name>
 * ```
 */
export class ExpressSyncShareAttachment extends pulumi.CustomResource {
    /**
     * Get an existing ExpressSyncShareAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ExpressSyncShareAttachmentState, opts?: pulumi.CustomResourceOptions): ExpressSyncShareAttachment {
        return new ExpressSyncShareAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cloudstoragegateway/expressSyncShareAttachment:ExpressSyncShareAttachment';

    /**
     * Returns true if the given object is an instance of ExpressSyncShareAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ExpressSyncShareAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ExpressSyncShareAttachment.__pulumiType;
    }

    /**
     * The ID of the ExpressSync.
     */
    public readonly expressSyncId!: pulumi.Output<string>;
    /**
     * The ID of the Gateway.
     */
    public readonly gatewayId!: pulumi.Output<string>;
    /**
     * The name of the GatewayFileShare. **NOTE:** When GatewayFileShare is associated with a speed sync group, its reverse synchronization function will be turned off by default.
     */
    public readonly shareName!: pulumi.Output<string>;

    /**
     * Create a ExpressSyncShareAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ExpressSyncShareAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ExpressSyncShareAttachmentArgs | ExpressSyncShareAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ExpressSyncShareAttachmentState | undefined;
            inputs["expressSyncId"] = state ? state.expressSyncId : undefined;
            inputs["gatewayId"] = state ? state.gatewayId : undefined;
            inputs["shareName"] = state ? state.shareName : undefined;
        } else {
            const args = argsOrState as ExpressSyncShareAttachmentArgs | undefined;
            if ((!args || args.expressSyncId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'expressSyncId'");
            }
            if ((!args || args.gatewayId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'gatewayId'");
            }
            if ((!args || args.shareName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'shareName'");
            }
            inputs["expressSyncId"] = args ? args.expressSyncId : undefined;
            inputs["gatewayId"] = args ? args.gatewayId : undefined;
            inputs["shareName"] = args ? args.shareName : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(ExpressSyncShareAttachment.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ExpressSyncShareAttachment resources.
 */
export interface ExpressSyncShareAttachmentState {
    /**
     * The ID of the ExpressSync.
     */
    expressSyncId?: pulumi.Input<string>;
    /**
     * The ID of the Gateway.
     */
    gatewayId?: pulumi.Input<string>;
    /**
     * The name of the GatewayFileShare. **NOTE:** When GatewayFileShare is associated with a speed sync group, its reverse synchronization function will be turned off by default.
     */
    shareName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ExpressSyncShareAttachment resource.
 */
export interface ExpressSyncShareAttachmentArgs {
    /**
     * The ID of the ExpressSync.
     */
    expressSyncId: pulumi.Input<string>;
    /**
     * The ID of the Gateway.
     */
    gatewayId: pulumi.Input<string>;
    /**
     * The name of the GatewayFileShare. **NOTE:** When GatewayFileShare is associated with a speed sync group, its reverse synchronization function will be turned off by default.
     */
    shareName: pulumi.Input<string>;
}
