// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package yundun

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Cloud Bastionhost instance resource ("Yundun_bastionhost" is the short term of this product).
// For information about Resource Manager Resource Directory and how to use it, see [What is Bastionhost](https://www.alibabacloud.com/help/en/doc-detail/52922.htm).
//
// > **NOTE:** The endpoint of bssopenapi used only support "business.aliyuncs.com" at present.
//
// > **NOTE:** Available in 1.63.0+ .
//
// > **NOTE:** In order to destroy Cloud Bastionhost instance , users are required to apply for white list first
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/yundun"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := yundun.NewBastionHostInstance(ctx, "_default", &yundun.BastionHostInstanceArgs{
// 			Description:      pulumi.String("Terraform-test"),
// 			LicenseCode:      pulumi.String("bhah_ent_50_asset"),
// 			Period:           pulumi.Int(1),
// 			SecurityGroupIds: "sg-test",
// 			VswitchId:        pulumi.String("v-testVswitch"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Yundun_bastionhost instance can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:yundun/bastionHostInstance:BastionHostInstance example bastionhost-exampe123456
// ```
type BastionHostInstance struct {
	pulumi.CustomResourceState

	// Description of the instance. This name can have a string of 1 to 63 characters.
	Description pulumi.StringOutput `pulumi:"description"`
	// The package type of Cloud Bastionhost instance. You can query more supported types through the [DescribePricingModule](https://help.aliyun.com/document_detail/96469.html).
	LicenseCode pulumi.StringOutput `pulumi:"licenseCode"`
	// Duration for initially producing the instance. Valid values: [1~9], 12, 24, 36. Default to 1. At present, the provider does not support modify "period".
	Period pulumi.IntPtrOutput `pulumi:"period"`
	// The Id of resource group which the Bastionhost Instance belongs. If not set, the resource is created in the default resource group.
	ResourceGroupId pulumi.StringPtrOutput `pulumi:"resourceGroupId"`
	// security group IDs configured to Bastionhost.
	SecurityGroupIds pulumi.StringArrayOutput `pulumi:"securityGroupIds"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapOutput `pulumi:"tags"`
	// VSwitch ID configured to Bastionhost.
	VswitchId pulumi.StringOutput `pulumi:"vswitchId"`
}

// NewBastionHostInstance registers a new resource with the given unique name, arguments, and options.
func NewBastionHostInstance(ctx *pulumi.Context,
	name string, args *BastionHostInstanceArgs, opts ...pulumi.ResourceOption) (*BastionHostInstance, error) {
	if args == nil || args.Description == nil {
		return nil, errors.New("missing required argument 'Description'")
	}
	if args == nil || args.LicenseCode == nil {
		return nil, errors.New("missing required argument 'LicenseCode'")
	}
	if args == nil || args.SecurityGroupIds == nil {
		return nil, errors.New("missing required argument 'SecurityGroupIds'")
	}
	if args == nil || args.VswitchId == nil {
		return nil, errors.New("missing required argument 'VswitchId'")
	}
	if args == nil {
		args = &BastionHostInstanceArgs{}
	}
	var resource BastionHostInstance
	err := ctx.RegisterResource("alicloud:yundun/bastionHostInstance:BastionHostInstance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBastionHostInstance gets an existing BastionHostInstance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBastionHostInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BastionHostInstanceState, opts ...pulumi.ResourceOption) (*BastionHostInstance, error) {
	var resource BastionHostInstance
	err := ctx.ReadResource("alicloud:yundun/bastionHostInstance:BastionHostInstance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BastionHostInstance resources.
type bastionHostInstanceState struct {
	// Description of the instance. This name can have a string of 1 to 63 characters.
	Description *string `pulumi:"description"`
	// The package type of Cloud Bastionhost instance. You can query more supported types through the [DescribePricingModule](https://help.aliyun.com/document_detail/96469.html).
	LicenseCode *string `pulumi:"licenseCode"`
	// Duration for initially producing the instance. Valid values: [1~9], 12, 24, 36. Default to 1. At present, the provider does not support modify "period".
	Period *int `pulumi:"period"`
	// The Id of resource group which the Bastionhost Instance belongs. If not set, the resource is created in the default resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// security group IDs configured to Bastionhost.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// VSwitch ID configured to Bastionhost.
	VswitchId *string `pulumi:"vswitchId"`
}

type BastionHostInstanceState struct {
	// Description of the instance. This name can have a string of 1 to 63 characters.
	Description pulumi.StringPtrInput
	// The package type of Cloud Bastionhost instance. You can query more supported types through the [DescribePricingModule](https://help.aliyun.com/document_detail/96469.html).
	LicenseCode pulumi.StringPtrInput
	// Duration for initially producing the instance. Valid values: [1~9], 12, 24, 36. Default to 1. At present, the provider does not support modify "period".
	Period pulumi.IntPtrInput
	// The Id of resource group which the Bastionhost Instance belongs. If not set, the resource is created in the default resource group.
	ResourceGroupId pulumi.StringPtrInput
	// security group IDs configured to Bastionhost.
	SecurityGroupIds pulumi.StringArrayInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// VSwitch ID configured to Bastionhost.
	VswitchId pulumi.StringPtrInput
}

func (BastionHostInstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*bastionHostInstanceState)(nil)).Elem()
}

type bastionHostInstanceArgs struct {
	// Description of the instance. This name can have a string of 1 to 63 characters.
	Description string `pulumi:"description"`
	// The package type of Cloud Bastionhost instance. You can query more supported types through the [DescribePricingModule](https://help.aliyun.com/document_detail/96469.html).
	LicenseCode string `pulumi:"licenseCode"`
	// Duration for initially producing the instance. Valid values: [1~9], 12, 24, 36. Default to 1. At present, the provider does not support modify "period".
	Period *int `pulumi:"period"`
	// The Id of resource group which the Bastionhost Instance belongs. If not set, the resource is created in the default resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// security group IDs configured to Bastionhost.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// VSwitch ID configured to Bastionhost.
	VswitchId string `pulumi:"vswitchId"`
}

// The set of arguments for constructing a BastionHostInstance resource.
type BastionHostInstanceArgs struct {
	// Description of the instance. This name can have a string of 1 to 63 characters.
	Description pulumi.StringInput
	// The package type of Cloud Bastionhost instance. You can query more supported types through the [DescribePricingModule](https://help.aliyun.com/document_detail/96469.html).
	LicenseCode pulumi.StringInput
	// Duration for initially producing the instance. Valid values: [1~9], 12, 24, 36. Default to 1. At present, the provider does not support modify "period".
	Period pulumi.IntPtrInput
	// The Id of resource group which the Bastionhost Instance belongs. If not set, the resource is created in the default resource group.
	ResourceGroupId pulumi.StringPtrInput
	// security group IDs configured to Bastionhost.
	SecurityGroupIds pulumi.StringArrayInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// VSwitch ID configured to Bastionhost.
	VswitchId pulumi.StringInput
}

func (BastionHostInstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*bastionHostInstanceArgs)(nil)).Elem()
}

type BastionHostInstanceInput interface {
	pulumi.Input

	ToBastionHostInstanceOutput() BastionHostInstanceOutput
	ToBastionHostInstanceOutputWithContext(ctx context.Context) BastionHostInstanceOutput
}

func (BastionHostInstance) ElementType() reflect.Type {
	return reflect.TypeOf((*BastionHostInstance)(nil)).Elem()
}

func (i BastionHostInstance) ToBastionHostInstanceOutput() BastionHostInstanceOutput {
	return i.ToBastionHostInstanceOutputWithContext(context.Background())
}

func (i BastionHostInstance) ToBastionHostInstanceOutputWithContext(ctx context.Context) BastionHostInstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BastionHostInstanceOutput)
}

type BastionHostInstanceOutput struct {
	*pulumi.OutputState
}

func (BastionHostInstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*BastionHostInstanceOutput)(nil)).Elem()
}

func (o BastionHostInstanceOutput) ToBastionHostInstanceOutput() BastionHostInstanceOutput {
	return o
}

func (o BastionHostInstanceOutput) ToBastionHostInstanceOutputWithContext(ctx context.Context) BastionHostInstanceOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(BastionHostInstanceOutput{})
}
