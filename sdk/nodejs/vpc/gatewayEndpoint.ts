// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a VPC Gateway Endpoint resource. VPC gateway endpoint.
 *
 * For information about VPC Gateway Endpoint and how to use it, see [What is Gateway Endpoint](https://www.alibabacloud.com/help/en/virtual-private-cloud/latest/gateway-endpoint).
 *
 * > **NOTE:** Available since v1.208.0.
 *
 * ## Import
 *
 * VPC Gateway Endpoint can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:vpc/gatewayEndpoint:GatewayEndpoint example <id>
 * ```
 */
export class GatewayEndpoint extends pulumi.CustomResource {
    /**
     * Get an existing GatewayEndpoint resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GatewayEndpointState, opts?: pulumi.CustomResourceOptions): GatewayEndpoint {
        return new GatewayEndpoint(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:vpc/gatewayEndpoint:GatewayEndpoint';

    /**
     * Returns true if the given object is an instance of GatewayEndpoint.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GatewayEndpoint {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GatewayEndpoint.__pulumiType;
    }

    /**
     * The creation time of the gateway endpoint.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * The description of the gateway endpoint.
     */
    public readonly gatewayEndpointDescrption!: pulumi.Output<string | undefined>;
    /**
     * The name of the gateway endpoint.
     */
    public readonly gatewayEndpointName!: pulumi.Output<string | undefined>;
    /**
     * Access control policies for cloud services. This parameter is required when the cloud service is oss. For details about the syntax and structure of access policies, see [syntax and structure of permission Policies](https://help.aliyun.com/document_detail/93739.html).
     */
    public readonly policyDocument!: pulumi.Output<string | undefined>;
    /**
     * The ID of the resource group to which the instance belongs.
     */
    public readonly resourceGroupId!: pulumi.Output<string>;
    /**
     * The name of endpoint service.
     */
    public readonly serviceName!: pulumi.Output<string>;
    /**
     * The status of VPC gateway endpoint.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The tags of the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * The ID of the VPC.
     */
    public readonly vpcId!: pulumi.Output<string>;

    /**
     * Create a GatewayEndpoint resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GatewayEndpointArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GatewayEndpointArgs | GatewayEndpointState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GatewayEndpointState | undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["gatewayEndpointDescrption"] = state ? state.gatewayEndpointDescrption : undefined;
            resourceInputs["gatewayEndpointName"] = state ? state.gatewayEndpointName : undefined;
            resourceInputs["policyDocument"] = state ? state.policyDocument : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["serviceName"] = state ? state.serviceName : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
        } else {
            const args = argsOrState as GatewayEndpointArgs | undefined;
            if ((!args || args.serviceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceName'");
            }
            if ((!args || args.vpcId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpcId'");
            }
            resourceInputs["gatewayEndpointDescrption"] = args ? args.gatewayEndpointDescrption : undefined;
            resourceInputs["gatewayEndpointName"] = args ? args.gatewayEndpointName : undefined;
            resourceInputs["policyDocument"] = args ? args.policyDocument : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["serviceName"] = args ? args.serviceName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GatewayEndpoint.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GatewayEndpoint resources.
 */
export interface GatewayEndpointState {
    /**
     * The creation time of the gateway endpoint.
     */
    createTime?: pulumi.Input<string>;
    /**
     * The description of the gateway endpoint.
     */
    gatewayEndpointDescrption?: pulumi.Input<string>;
    /**
     * The name of the gateway endpoint.
     */
    gatewayEndpointName?: pulumi.Input<string>;
    /**
     * Access control policies for cloud services. This parameter is required when the cloud service is oss. For details about the syntax and structure of access policies, see [syntax and structure of permission Policies](https://help.aliyun.com/document_detail/93739.html).
     */
    policyDocument?: pulumi.Input<string>;
    /**
     * The ID of the resource group to which the instance belongs.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The name of endpoint service.
     */
    serviceName?: pulumi.Input<string>;
    /**
     * The status of VPC gateway endpoint.
     */
    status?: pulumi.Input<string>;
    /**
     * The tags of the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The ID of the VPC.
     */
    vpcId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a GatewayEndpoint resource.
 */
export interface GatewayEndpointArgs {
    /**
     * The description of the gateway endpoint.
     */
    gatewayEndpointDescrption?: pulumi.Input<string>;
    /**
     * The name of the gateway endpoint.
     */
    gatewayEndpointName?: pulumi.Input<string>;
    /**
     * Access control policies for cloud services. This parameter is required when the cloud service is oss. For details about the syntax and structure of access policies, see [syntax and structure of permission Policies](https://help.aliyun.com/document_detail/93739.html).
     */
    policyDocument?: pulumi.Input<string>;
    /**
     * The ID of the resource group to which the instance belongs.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The name of endpoint service.
     */
    serviceName: pulumi.Input<string>;
    /**
     * The tags of the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The ID of the VPC.
     */
    vpcId: pulumi.Input<string>;
}
