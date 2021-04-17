// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a ECS Hpc Cluster resource.
//
// For information about ECS Hpc Cluster and how to use it, see [What is Hpc Cluster](https://www.alibabacloud.com/help/en/doc-detail/109138.htm).
//
// > **NOTE:** Available in v1.116.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := ecs.NewHpcCluster(ctx, "example", &ecs.HpcClusterArgs{
// 			Description: pulumi.String("For Terraform Test"),
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
// ECS Hpc Cluster can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:ecs/hpcCluster:HpcCluster example <id>
// ```
type HpcCluster struct {
	pulumi.CustomResourceState

	// The description of ECS Hpc Cluster.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The name of ECS Hpc Cluster.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewHpcCluster registers a new resource with the given unique name, arguments, and options.
func NewHpcCluster(ctx *pulumi.Context,
	name string, args *HpcClusterArgs, opts ...pulumi.ResourceOption) (*HpcCluster, error) {
	if args == nil {
		args = &HpcClusterArgs{}
	}

	var resource HpcCluster
	err := ctx.RegisterResource("alicloud:ecs/hpcCluster:HpcCluster", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHpcCluster gets an existing HpcCluster resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHpcCluster(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HpcClusterState, opts ...pulumi.ResourceOption) (*HpcCluster, error) {
	var resource HpcCluster
	err := ctx.ReadResource("alicloud:ecs/hpcCluster:HpcCluster", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering HpcCluster resources.
type hpcClusterState struct {
	// The description of ECS Hpc Cluster.
	Description *string `pulumi:"description"`
	// The name of ECS Hpc Cluster.
	Name *string `pulumi:"name"`
}

type HpcClusterState struct {
	// The description of ECS Hpc Cluster.
	Description pulumi.StringPtrInput
	// The name of ECS Hpc Cluster.
	Name pulumi.StringPtrInput
}

func (HpcClusterState) ElementType() reflect.Type {
	return reflect.TypeOf((*hpcClusterState)(nil)).Elem()
}

type hpcClusterArgs struct {
	// The description of ECS Hpc Cluster.
	Description *string `pulumi:"description"`
	// The name of ECS Hpc Cluster.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a HpcCluster resource.
type HpcClusterArgs struct {
	// The description of ECS Hpc Cluster.
	Description pulumi.StringPtrInput
	// The name of ECS Hpc Cluster.
	Name pulumi.StringPtrInput
}

func (HpcClusterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*hpcClusterArgs)(nil)).Elem()
}

type HpcClusterInput interface {
	pulumi.Input

	ToHpcClusterOutput() HpcClusterOutput
	ToHpcClusterOutputWithContext(ctx context.Context) HpcClusterOutput
}

func (*HpcCluster) ElementType() reflect.Type {
	return reflect.TypeOf((*HpcCluster)(nil))
}

func (i *HpcCluster) ToHpcClusterOutput() HpcClusterOutput {
	return i.ToHpcClusterOutputWithContext(context.Background())
}

func (i *HpcCluster) ToHpcClusterOutputWithContext(ctx context.Context) HpcClusterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HpcClusterOutput)
}

func (i *HpcCluster) ToHpcClusterPtrOutput() HpcClusterPtrOutput {
	return i.ToHpcClusterPtrOutputWithContext(context.Background())
}

func (i *HpcCluster) ToHpcClusterPtrOutputWithContext(ctx context.Context) HpcClusterPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HpcClusterPtrOutput)
}

type HpcClusterPtrInput interface {
	pulumi.Input

	ToHpcClusterPtrOutput() HpcClusterPtrOutput
	ToHpcClusterPtrOutputWithContext(ctx context.Context) HpcClusterPtrOutput
}

type hpcClusterPtrType HpcClusterArgs

func (*hpcClusterPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**HpcCluster)(nil))
}

func (i *hpcClusterPtrType) ToHpcClusterPtrOutput() HpcClusterPtrOutput {
	return i.ToHpcClusterPtrOutputWithContext(context.Background())
}

func (i *hpcClusterPtrType) ToHpcClusterPtrOutputWithContext(ctx context.Context) HpcClusterPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HpcClusterPtrOutput)
}

// HpcClusterArrayInput is an input type that accepts HpcClusterArray and HpcClusterArrayOutput values.
// You can construct a concrete instance of `HpcClusterArrayInput` via:
//
//          HpcClusterArray{ HpcClusterArgs{...} }
type HpcClusterArrayInput interface {
	pulumi.Input

	ToHpcClusterArrayOutput() HpcClusterArrayOutput
	ToHpcClusterArrayOutputWithContext(context.Context) HpcClusterArrayOutput
}

type HpcClusterArray []HpcClusterInput

func (HpcClusterArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*HpcCluster)(nil))
}

func (i HpcClusterArray) ToHpcClusterArrayOutput() HpcClusterArrayOutput {
	return i.ToHpcClusterArrayOutputWithContext(context.Background())
}

func (i HpcClusterArray) ToHpcClusterArrayOutputWithContext(ctx context.Context) HpcClusterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HpcClusterArrayOutput)
}

// HpcClusterMapInput is an input type that accepts HpcClusterMap and HpcClusterMapOutput values.
// You can construct a concrete instance of `HpcClusterMapInput` via:
//
//          HpcClusterMap{ "key": HpcClusterArgs{...} }
type HpcClusterMapInput interface {
	pulumi.Input

	ToHpcClusterMapOutput() HpcClusterMapOutput
	ToHpcClusterMapOutputWithContext(context.Context) HpcClusterMapOutput
}

type HpcClusterMap map[string]HpcClusterInput

func (HpcClusterMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*HpcCluster)(nil))
}

func (i HpcClusterMap) ToHpcClusterMapOutput() HpcClusterMapOutput {
	return i.ToHpcClusterMapOutputWithContext(context.Background())
}

func (i HpcClusterMap) ToHpcClusterMapOutputWithContext(ctx context.Context) HpcClusterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HpcClusterMapOutput)
}

type HpcClusterOutput struct {
	*pulumi.OutputState
}

func (HpcClusterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*HpcCluster)(nil))
}

func (o HpcClusterOutput) ToHpcClusterOutput() HpcClusterOutput {
	return o
}

func (o HpcClusterOutput) ToHpcClusterOutputWithContext(ctx context.Context) HpcClusterOutput {
	return o
}

func (o HpcClusterOutput) ToHpcClusterPtrOutput() HpcClusterPtrOutput {
	return o.ToHpcClusterPtrOutputWithContext(context.Background())
}

func (o HpcClusterOutput) ToHpcClusterPtrOutputWithContext(ctx context.Context) HpcClusterPtrOutput {
	return o.ApplyT(func(v HpcCluster) *HpcCluster {
		return &v
	}).(HpcClusterPtrOutput)
}

type HpcClusterPtrOutput struct {
	*pulumi.OutputState
}

func (HpcClusterPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HpcCluster)(nil))
}

func (o HpcClusterPtrOutput) ToHpcClusterPtrOutput() HpcClusterPtrOutput {
	return o
}

func (o HpcClusterPtrOutput) ToHpcClusterPtrOutputWithContext(ctx context.Context) HpcClusterPtrOutput {
	return o
}

type HpcClusterArrayOutput struct{ *pulumi.OutputState }

func (HpcClusterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]HpcCluster)(nil))
}

func (o HpcClusterArrayOutput) ToHpcClusterArrayOutput() HpcClusterArrayOutput {
	return o
}

func (o HpcClusterArrayOutput) ToHpcClusterArrayOutputWithContext(ctx context.Context) HpcClusterArrayOutput {
	return o
}

func (o HpcClusterArrayOutput) Index(i pulumi.IntInput) HpcClusterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) HpcCluster {
		return vs[0].([]HpcCluster)[vs[1].(int)]
	}).(HpcClusterOutput)
}

type HpcClusterMapOutput struct{ *pulumi.OutputState }

func (HpcClusterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]HpcCluster)(nil))
}

func (o HpcClusterMapOutput) ToHpcClusterMapOutput() HpcClusterMapOutput {
	return o
}

func (o HpcClusterMapOutput) ToHpcClusterMapOutputWithContext(ctx context.Context) HpcClusterMapOutput {
	return o
}

func (o HpcClusterMapOutput) MapIndex(k pulumi.StringInput) HpcClusterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) HpcCluster {
		return vs[0].(map[string]HpcCluster)[vs[1].(string)]
	}).(HpcClusterOutput)
}

func init() {
	pulumi.RegisterOutputType(HpcClusterOutput{})
	pulumi.RegisterOutputType(HpcClusterPtrOutput{})
	pulumi.RegisterOutputType(HpcClusterArrayOutput{})
	pulumi.RegisterOutputType(HpcClusterMapOutput{})
}