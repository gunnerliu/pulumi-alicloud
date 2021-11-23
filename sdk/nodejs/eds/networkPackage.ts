// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a ECD Network Package resource.
 *
 * For information about ECD Network Package and how to use it, see [What is Network Package](https://help.aliyun.com/document_detail/188382.html).
 *
 * > **NOTE:** Available in v1.142.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const _default = new alicloud.eds.SimpleOfficeSite("default", {
 *     cidrBlock: "172.16.0.0/12",
 *     desktopAccessType: "Internet",
 *     officeSiteName: "your_office_site_name",
 * });
 * const example = new alicloud.eds.NetworkPackage("example", {
 *     bandwidth: 10,
 *     officeSiteId: _default.id,
 * });
 * ```
 *
 * ## Import
 *
 * ECD Network Package can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:eds/networkPackage:NetworkPackage example <id>
 * ```
 */
export class NetworkPackage extends pulumi.CustomResource {
    /**
     * Get an existing NetworkPackage resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetworkPackageState, opts?: pulumi.CustomResourceOptions): NetworkPackage {
        return new NetworkPackage(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:eds/networkPackage:NetworkPackage';

    /**
     * Returns true if the given object is an instance of NetworkPackage.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NetworkPackage {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NetworkPackage.__pulumiType;
    }

    /**
     * The bandwidth of package public network bandwidth peak. Valid values: 1~200. Unit:Mbps.
     */
    public readonly bandwidth!: pulumi.Output<number>;
    /**
     * The internet charge type  of  package.
     */
    public /*out*/ readonly internetChargeType!: pulumi.Output<string>;
    /**
     * The ID of office site.
     */
    public readonly officeSiteId!: pulumi.Output<string>;
    /**
     * The status of network package. Valid values: `Creating`, `InUse`, `Releasing`,`Released`.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a NetworkPackage resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NetworkPackageArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NetworkPackageArgs | NetworkPackageState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NetworkPackageState | undefined;
            inputs["bandwidth"] = state ? state.bandwidth : undefined;
            inputs["internetChargeType"] = state ? state.internetChargeType : undefined;
            inputs["officeSiteId"] = state ? state.officeSiteId : undefined;
            inputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as NetworkPackageArgs | undefined;
            if ((!args || args.bandwidth === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bandwidth'");
            }
            if ((!args || args.officeSiteId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'officeSiteId'");
            }
            inputs["bandwidth"] = args ? args.bandwidth : undefined;
            inputs["officeSiteId"] = args ? args.officeSiteId : undefined;
            inputs["internetChargeType"] = undefined /*out*/;
            inputs["status"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(NetworkPackage.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NetworkPackage resources.
 */
export interface NetworkPackageState {
    /**
     * The bandwidth of package public network bandwidth peak. Valid values: 1~200. Unit:Mbps.
     */
    bandwidth?: pulumi.Input<number>;
    /**
     * The internet charge type  of  package.
     */
    internetChargeType?: pulumi.Input<string>;
    /**
     * The ID of office site.
     */
    officeSiteId?: pulumi.Input<string>;
    /**
     * The status of network package. Valid values: `Creating`, `InUse`, `Releasing`,`Released`.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a NetworkPackage resource.
 */
export interface NetworkPackageArgs {
    /**
     * The bandwidth of package public network bandwidth peak. Valid values: 1~200. Unit:Mbps.
     */
    bandwidth: pulumi.Input<number>;
    /**
     * The ID of office site.
     */
    officeSiteId: pulumi.Input<string>;
}
