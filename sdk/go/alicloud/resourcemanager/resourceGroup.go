// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package resourcemanager

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Resource Manager Resource Group resource. If you need to group cloud resources according to business departments, projects, and other dimensions, you can create resource groups.
// For information about Resource Manager Resoource Group and how to use it, see [What is Resource Manager Resource Group](https://www.alibabacloud.com/help/en/doc-detail/94485.htm)
//
// > **NOTE:** Available since v1.82.0.
//
// ## Example Usage
//
// # Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/resourcemanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "tfexample"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			_, err := resourcemanager.NewResourceGroup(ctx, "example", &resourcemanager.ResourceGroupArgs{
//				ResourceGroupName: pulumi.String(name),
//				DisplayName:       pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Resource Manager Resource Group can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:resourcemanager/resourceGroup:ResourceGroup example abc123456
//
// ```
type ResourceGroup struct {
	pulumi.CustomResourceState

	// The ID of the Alibaba Cloud account to which the resource group belongs.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The display name of the resource group. The name must be 1 to 30 characters in length and can contain letters, digits, periods (.), at signs (@), and hyphens (-).
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// Field `name` has been deprecated from version 1.114.0. Use `resourceGroupName` instead.
	//
	// Deprecated: Field 'name' has been deprecated from version 1.114.0. Use 'resource_group_name' instead.
	Name pulumi.StringOutput `pulumi:"name"`
	// The status of the resource group in all regions. See `regionStatuses` below.
	RegionStatuses ResourceGroupRegionStatusArrayOutput `pulumi:"regionStatuses"`
	// The unique identifier of the resource group.The identifier must be 3 to 12 characters in length and can contain letters, digits, periods (.), hyphens (-), and underscores (_). The identifier must start with a letter.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// The status of the regional resource group.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewResourceGroup registers a new resource with the given unique name, arguments, and options.
func NewResourceGroup(ctx *pulumi.Context,
	name string, args *ResourceGroupArgs, opts ...pulumi.ResourceOption) (*ResourceGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DisplayName == nil {
		return nil, errors.New("invalid value for required argument 'DisplayName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ResourceGroup
	err := ctx.RegisterResource("alicloud:resourcemanager/resourceGroup:ResourceGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetResourceGroup gets an existing ResourceGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetResourceGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ResourceGroupState, opts ...pulumi.ResourceOption) (*ResourceGroup, error) {
	var resource ResourceGroup
	err := ctx.ReadResource("alicloud:resourcemanager/resourceGroup:ResourceGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ResourceGroup resources.
type resourceGroupState struct {
	// The ID of the Alibaba Cloud account to which the resource group belongs.
	AccountId *string `pulumi:"accountId"`
	// The display name of the resource group. The name must be 1 to 30 characters in length and can contain letters, digits, periods (.), at signs (@), and hyphens (-).
	DisplayName *string `pulumi:"displayName"`
	// Field `name` has been deprecated from version 1.114.0. Use `resourceGroupName` instead.
	//
	// Deprecated: Field 'name' has been deprecated from version 1.114.0. Use 'resource_group_name' instead.
	Name *string `pulumi:"name"`
	// The status of the resource group in all regions. See `regionStatuses` below.
	RegionStatuses []ResourceGroupRegionStatus `pulumi:"regionStatuses"`
	// The unique identifier of the resource group.The identifier must be 3 to 12 characters in length and can contain letters, digits, periods (.), hyphens (-), and underscores (_). The identifier must start with a letter.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The status of the regional resource group.
	Status *string `pulumi:"status"`
}

type ResourceGroupState struct {
	// The ID of the Alibaba Cloud account to which the resource group belongs.
	AccountId pulumi.StringPtrInput
	// The display name of the resource group. The name must be 1 to 30 characters in length and can contain letters, digits, periods (.), at signs (@), and hyphens (-).
	DisplayName pulumi.StringPtrInput
	// Field `name` has been deprecated from version 1.114.0. Use `resourceGroupName` instead.
	//
	// Deprecated: Field 'name' has been deprecated from version 1.114.0. Use 'resource_group_name' instead.
	Name pulumi.StringPtrInput
	// The status of the resource group in all regions. See `regionStatuses` below.
	RegionStatuses ResourceGroupRegionStatusArrayInput
	// The unique identifier of the resource group.The identifier must be 3 to 12 characters in length and can contain letters, digits, periods (.), hyphens (-), and underscores (_). The identifier must start with a letter.
	ResourceGroupName pulumi.StringPtrInput
	// The status of the regional resource group.
	Status pulumi.StringPtrInput
}

func (ResourceGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceGroupState)(nil)).Elem()
}

type resourceGroupArgs struct {
	// The display name of the resource group. The name must be 1 to 30 characters in length and can contain letters, digits, periods (.), at signs (@), and hyphens (-).
	DisplayName string `pulumi:"displayName"`
	// Field `name` has been deprecated from version 1.114.0. Use `resourceGroupName` instead.
	//
	// Deprecated: Field 'name' has been deprecated from version 1.114.0. Use 'resource_group_name' instead.
	Name *string `pulumi:"name"`
	// The unique identifier of the resource group.The identifier must be 3 to 12 characters in length and can contain letters, digits, periods (.), hyphens (-), and underscores (_). The identifier must start with a letter.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
}

// The set of arguments for constructing a ResourceGroup resource.
type ResourceGroupArgs struct {
	// The display name of the resource group. The name must be 1 to 30 characters in length and can contain letters, digits, periods (.), at signs (@), and hyphens (-).
	DisplayName pulumi.StringInput
	// Field `name` has been deprecated from version 1.114.0. Use `resourceGroupName` instead.
	//
	// Deprecated: Field 'name' has been deprecated from version 1.114.0. Use 'resource_group_name' instead.
	Name pulumi.StringPtrInput
	// The unique identifier of the resource group.The identifier must be 3 to 12 characters in length and can contain letters, digits, periods (.), hyphens (-), and underscores (_). The identifier must start with a letter.
	ResourceGroupName pulumi.StringPtrInput
}

func (ResourceGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceGroupArgs)(nil)).Elem()
}

type ResourceGroupInput interface {
	pulumi.Input

	ToResourceGroupOutput() ResourceGroupOutput
	ToResourceGroupOutputWithContext(ctx context.Context) ResourceGroupOutput
}

func (*ResourceGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**ResourceGroup)(nil)).Elem()
}

func (i *ResourceGroup) ToResourceGroupOutput() ResourceGroupOutput {
	return i.ToResourceGroupOutputWithContext(context.Background())
}

func (i *ResourceGroup) ToResourceGroupOutputWithContext(ctx context.Context) ResourceGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceGroupOutput)
}

// ResourceGroupArrayInput is an input type that accepts ResourceGroupArray and ResourceGroupArrayOutput values.
// You can construct a concrete instance of `ResourceGroupArrayInput` via:
//
//	ResourceGroupArray{ ResourceGroupArgs{...} }
type ResourceGroupArrayInput interface {
	pulumi.Input

	ToResourceGroupArrayOutput() ResourceGroupArrayOutput
	ToResourceGroupArrayOutputWithContext(context.Context) ResourceGroupArrayOutput
}

type ResourceGroupArray []ResourceGroupInput

func (ResourceGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResourceGroup)(nil)).Elem()
}

func (i ResourceGroupArray) ToResourceGroupArrayOutput() ResourceGroupArrayOutput {
	return i.ToResourceGroupArrayOutputWithContext(context.Background())
}

func (i ResourceGroupArray) ToResourceGroupArrayOutputWithContext(ctx context.Context) ResourceGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceGroupArrayOutput)
}

// ResourceGroupMapInput is an input type that accepts ResourceGroupMap and ResourceGroupMapOutput values.
// You can construct a concrete instance of `ResourceGroupMapInput` via:
//
//	ResourceGroupMap{ "key": ResourceGroupArgs{...} }
type ResourceGroupMapInput interface {
	pulumi.Input

	ToResourceGroupMapOutput() ResourceGroupMapOutput
	ToResourceGroupMapOutputWithContext(context.Context) ResourceGroupMapOutput
}

type ResourceGroupMap map[string]ResourceGroupInput

func (ResourceGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResourceGroup)(nil)).Elem()
}

func (i ResourceGroupMap) ToResourceGroupMapOutput() ResourceGroupMapOutput {
	return i.ToResourceGroupMapOutputWithContext(context.Background())
}

func (i ResourceGroupMap) ToResourceGroupMapOutputWithContext(ctx context.Context) ResourceGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceGroupMapOutput)
}

type ResourceGroupOutput struct{ *pulumi.OutputState }

func (ResourceGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ResourceGroup)(nil)).Elem()
}

func (o ResourceGroupOutput) ToResourceGroupOutput() ResourceGroupOutput {
	return o
}

func (o ResourceGroupOutput) ToResourceGroupOutputWithContext(ctx context.Context) ResourceGroupOutput {
	return o
}

// The ID of the Alibaba Cloud account to which the resource group belongs.
func (o ResourceGroupOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourceGroup) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The display name of the resource group. The name must be 1 to 30 characters in length and can contain letters, digits, periods (.), at signs (@), and hyphens (-).
func (o ResourceGroupOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourceGroup) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// Field `name` has been deprecated from version 1.114.0. Use `resourceGroupName` instead.
//
// Deprecated: Field 'name' has been deprecated from version 1.114.0. Use 'resource_group_name' instead.
func (o ResourceGroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourceGroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The status of the resource group in all regions. See `regionStatuses` below.
func (o ResourceGroupOutput) RegionStatuses() ResourceGroupRegionStatusArrayOutput {
	return o.ApplyT(func(v *ResourceGroup) ResourceGroupRegionStatusArrayOutput { return v.RegionStatuses }).(ResourceGroupRegionStatusArrayOutput)
}

// The unique identifier of the resource group.The identifier must be 3 to 12 characters in length and can contain letters, digits, periods (.), hyphens (-), and underscores (_). The identifier must start with a letter.
func (o ResourceGroupOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourceGroup) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The status of the regional resource group.
func (o ResourceGroupOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourceGroup) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type ResourceGroupArrayOutput struct{ *pulumi.OutputState }

func (ResourceGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResourceGroup)(nil)).Elem()
}

func (o ResourceGroupArrayOutput) ToResourceGroupArrayOutput() ResourceGroupArrayOutput {
	return o
}

func (o ResourceGroupArrayOutput) ToResourceGroupArrayOutputWithContext(ctx context.Context) ResourceGroupArrayOutput {
	return o
}

func (o ResourceGroupArrayOutput) Index(i pulumi.IntInput) ResourceGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ResourceGroup {
		return vs[0].([]*ResourceGroup)[vs[1].(int)]
	}).(ResourceGroupOutput)
}

type ResourceGroupMapOutput struct{ *pulumi.OutputState }

func (ResourceGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResourceGroup)(nil)).Elem()
}

func (o ResourceGroupMapOutput) ToResourceGroupMapOutput() ResourceGroupMapOutput {
	return o
}

func (o ResourceGroupMapOutput) ToResourceGroupMapOutputWithContext(ctx context.Context) ResourceGroupMapOutput {
	return o
}

func (o ResourceGroupMapOutput) MapIndex(k pulumi.StringInput) ResourceGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ResourceGroup {
		return vs[0].(map[string]*ResourceGroup)[vs[1].(string)]
	}).(ResourceGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceGroupInput)(nil)).Elem(), &ResourceGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceGroupArrayInput)(nil)).Elem(), ResourceGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceGroupMapInput)(nil)).Elem(), ResourceGroupMap{})
	pulumi.RegisterOutputType(ResourceGroupOutput{})
	pulumi.RegisterOutputType(ResourceGroupArrayOutput{})
	pulumi.RegisterOutputType(ResourceGroupMapOutput{})
}
