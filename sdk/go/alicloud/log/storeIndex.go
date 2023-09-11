// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package log

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Log Service provides the LogSearch/Analytics function to query and analyze large amounts of logs in real time.
// You can use this function by enabling the index and field statistics. [Refer to details](https://www.alibabacloud.com/help/doc-detail/43772.htm)
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/log"
//	"github.com/pulumi/pulumi-random/sdk/v4/go/random"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := random.NewRandomInteger(ctx, "default", &random.RandomIntegerArgs{
//				Max: pulumi.Int(99999),
//				Min: pulumi.Int(10000),
//			})
//			if err != nil {
//				return err
//			}
//			exampleProject, err := log.NewProject(ctx, "exampleProject", &log.ProjectArgs{
//				Description: pulumi.String("terraform-example"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleStore, err := log.NewStore(ctx, "exampleStore", &log.StoreArgs{
//				Project:            exampleProject.Name,
//				ShardCount:         pulumi.Int(3),
//				AutoSplit:          pulumi.Bool(true),
//				MaxSplitShardCount: pulumi.Int(60),
//				AppendMeta:         pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = log.NewStoreIndex(ctx, "exampleStoreIndex", &log.StoreIndexArgs{
//				Project:  exampleProject.Name,
//				Logstore: exampleStore.Name,
//				FullText: &log.StoreIndexFullTextArgs{
//					CaseSensitive: pulumi.Bool(true),
//					Token:         pulumi.String(" #$^*\n	"),
//				},
//				FieldSearches: log.StoreIndexFieldSearchArray{
//					&log.StoreIndexFieldSearchArgs{
//						Name:            pulumi.String("terraform-example"),
//						EnableAnalytics: pulumi.Bool(true),
//						Type:            pulumi.String("text"),
//						Token:           pulumi.String(" #$^*\n	"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ## Module Support
//
// You can use the existing sls module
// to create SLS project, store and store index one-click, like ECS instances.
//
// ## Import
//
// Log store index can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:log/storeIndex:StoreIndex example tf-log:tf-log-store
//
// ```
type StoreIndex struct {
	pulumi.CustomResourceState

	// List configurations of field search index. Valid item as follows:
	FieldSearches StoreIndexFieldSearchArrayOutput `pulumi:"fieldSearches"`
	// The configuration of full text index. Valid item as follows:
	FullText StoreIndexFullTextPtrOutput `pulumi:"fullText"`
	// The log store name to the query index belongs.
	Logstore pulumi.StringOutput `pulumi:"logstore"`
	// The project name to the log store belongs.
	Project pulumi.StringOutput `pulumi:"project"`
}

// NewStoreIndex registers a new resource with the given unique name, arguments, and options.
func NewStoreIndex(ctx *pulumi.Context,
	name string, args *StoreIndexArgs, opts ...pulumi.ResourceOption) (*StoreIndex, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Logstore == nil {
		return nil, errors.New("invalid value for required argument 'Logstore'")
	}
	if args.Project == nil {
		return nil, errors.New("invalid value for required argument 'Project'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource StoreIndex
	err := ctx.RegisterResource("alicloud:log/storeIndex:StoreIndex", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStoreIndex gets an existing StoreIndex resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStoreIndex(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StoreIndexState, opts ...pulumi.ResourceOption) (*StoreIndex, error) {
	var resource StoreIndex
	err := ctx.ReadResource("alicloud:log/storeIndex:StoreIndex", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering StoreIndex resources.
type storeIndexState struct {
	// List configurations of field search index. Valid item as follows:
	FieldSearches []StoreIndexFieldSearch `pulumi:"fieldSearches"`
	// The configuration of full text index. Valid item as follows:
	FullText *StoreIndexFullText `pulumi:"fullText"`
	// The log store name to the query index belongs.
	Logstore *string `pulumi:"logstore"`
	// The project name to the log store belongs.
	Project *string `pulumi:"project"`
}

type StoreIndexState struct {
	// List configurations of field search index. Valid item as follows:
	FieldSearches StoreIndexFieldSearchArrayInput
	// The configuration of full text index. Valid item as follows:
	FullText StoreIndexFullTextPtrInput
	// The log store name to the query index belongs.
	Logstore pulumi.StringPtrInput
	// The project name to the log store belongs.
	Project pulumi.StringPtrInput
}

func (StoreIndexState) ElementType() reflect.Type {
	return reflect.TypeOf((*storeIndexState)(nil)).Elem()
}

type storeIndexArgs struct {
	// List configurations of field search index. Valid item as follows:
	FieldSearches []StoreIndexFieldSearch `pulumi:"fieldSearches"`
	// The configuration of full text index. Valid item as follows:
	FullText *StoreIndexFullText `pulumi:"fullText"`
	// The log store name to the query index belongs.
	Logstore string `pulumi:"logstore"`
	// The project name to the log store belongs.
	Project string `pulumi:"project"`
}

// The set of arguments for constructing a StoreIndex resource.
type StoreIndexArgs struct {
	// List configurations of field search index. Valid item as follows:
	FieldSearches StoreIndexFieldSearchArrayInput
	// The configuration of full text index. Valid item as follows:
	FullText StoreIndexFullTextPtrInput
	// The log store name to the query index belongs.
	Logstore pulumi.StringInput
	// The project name to the log store belongs.
	Project pulumi.StringInput
}

func (StoreIndexArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*storeIndexArgs)(nil)).Elem()
}

type StoreIndexInput interface {
	pulumi.Input

	ToStoreIndexOutput() StoreIndexOutput
	ToStoreIndexOutputWithContext(ctx context.Context) StoreIndexOutput
}

func (*StoreIndex) ElementType() reflect.Type {
	return reflect.TypeOf((**StoreIndex)(nil)).Elem()
}

func (i *StoreIndex) ToStoreIndexOutput() StoreIndexOutput {
	return i.ToStoreIndexOutputWithContext(context.Background())
}

func (i *StoreIndex) ToStoreIndexOutputWithContext(ctx context.Context) StoreIndexOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StoreIndexOutput)
}

func (i *StoreIndex) ToOutput(ctx context.Context) pulumix.Output[*StoreIndex] {
	return pulumix.Output[*StoreIndex]{
		OutputState: i.ToStoreIndexOutputWithContext(ctx).OutputState,
	}
}

// StoreIndexArrayInput is an input type that accepts StoreIndexArray and StoreIndexArrayOutput values.
// You can construct a concrete instance of `StoreIndexArrayInput` via:
//
//	StoreIndexArray{ StoreIndexArgs{...} }
type StoreIndexArrayInput interface {
	pulumi.Input

	ToStoreIndexArrayOutput() StoreIndexArrayOutput
	ToStoreIndexArrayOutputWithContext(context.Context) StoreIndexArrayOutput
}

type StoreIndexArray []StoreIndexInput

func (StoreIndexArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StoreIndex)(nil)).Elem()
}

func (i StoreIndexArray) ToStoreIndexArrayOutput() StoreIndexArrayOutput {
	return i.ToStoreIndexArrayOutputWithContext(context.Background())
}

func (i StoreIndexArray) ToStoreIndexArrayOutputWithContext(ctx context.Context) StoreIndexArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StoreIndexArrayOutput)
}

func (i StoreIndexArray) ToOutput(ctx context.Context) pulumix.Output[[]*StoreIndex] {
	return pulumix.Output[[]*StoreIndex]{
		OutputState: i.ToStoreIndexArrayOutputWithContext(ctx).OutputState,
	}
}

// StoreIndexMapInput is an input type that accepts StoreIndexMap and StoreIndexMapOutput values.
// You can construct a concrete instance of `StoreIndexMapInput` via:
//
//	StoreIndexMap{ "key": StoreIndexArgs{...} }
type StoreIndexMapInput interface {
	pulumi.Input

	ToStoreIndexMapOutput() StoreIndexMapOutput
	ToStoreIndexMapOutputWithContext(context.Context) StoreIndexMapOutput
}

type StoreIndexMap map[string]StoreIndexInput

func (StoreIndexMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StoreIndex)(nil)).Elem()
}

func (i StoreIndexMap) ToStoreIndexMapOutput() StoreIndexMapOutput {
	return i.ToStoreIndexMapOutputWithContext(context.Background())
}

func (i StoreIndexMap) ToStoreIndexMapOutputWithContext(ctx context.Context) StoreIndexMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StoreIndexMapOutput)
}

func (i StoreIndexMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*StoreIndex] {
	return pulumix.Output[map[string]*StoreIndex]{
		OutputState: i.ToStoreIndexMapOutputWithContext(ctx).OutputState,
	}
}

type StoreIndexOutput struct{ *pulumi.OutputState }

func (StoreIndexOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**StoreIndex)(nil)).Elem()
}

func (o StoreIndexOutput) ToStoreIndexOutput() StoreIndexOutput {
	return o
}

func (o StoreIndexOutput) ToStoreIndexOutputWithContext(ctx context.Context) StoreIndexOutput {
	return o
}

func (o StoreIndexOutput) ToOutput(ctx context.Context) pulumix.Output[*StoreIndex] {
	return pulumix.Output[*StoreIndex]{
		OutputState: o.OutputState,
	}
}

// List configurations of field search index. Valid item as follows:
func (o StoreIndexOutput) FieldSearches() StoreIndexFieldSearchArrayOutput {
	return o.ApplyT(func(v *StoreIndex) StoreIndexFieldSearchArrayOutput { return v.FieldSearches }).(StoreIndexFieldSearchArrayOutput)
}

// The configuration of full text index. Valid item as follows:
func (o StoreIndexOutput) FullText() StoreIndexFullTextPtrOutput {
	return o.ApplyT(func(v *StoreIndex) StoreIndexFullTextPtrOutput { return v.FullText }).(StoreIndexFullTextPtrOutput)
}

// The log store name to the query index belongs.
func (o StoreIndexOutput) Logstore() pulumi.StringOutput {
	return o.ApplyT(func(v *StoreIndex) pulumi.StringOutput { return v.Logstore }).(pulumi.StringOutput)
}

// The project name to the log store belongs.
func (o StoreIndexOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *StoreIndex) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

type StoreIndexArrayOutput struct{ *pulumi.OutputState }

func (StoreIndexArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StoreIndex)(nil)).Elem()
}

func (o StoreIndexArrayOutput) ToStoreIndexArrayOutput() StoreIndexArrayOutput {
	return o
}

func (o StoreIndexArrayOutput) ToStoreIndexArrayOutputWithContext(ctx context.Context) StoreIndexArrayOutput {
	return o
}

func (o StoreIndexArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*StoreIndex] {
	return pulumix.Output[[]*StoreIndex]{
		OutputState: o.OutputState,
	}
}

func (o StoreIndexArrayOutput) Index(i pulumi.IntInput) StoreIndexOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *StoreIndex {
		return vs[0].([]*StoreIndex)[vs[1].(int)]
	}).(StoreIndexOutput)
}

type StoreIndexMapOutput struct{ *pulumi.OutputState }

func (StoreIndexMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StoreIndex)(nil)).Elem()
}

func (o StoreIndexMapOutput) ToStoreIndexMapOutput() StoreIndexMapOutput {
	return o
}

func (o StoreIndexMapOutput) ToStoreIndexMapOutputWithContext(ctx context.Context) StoreIndexMapOutput {
	return o
}

func (o StoreIndexMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*StoreIndex] {
	return pulumix.Output[map[string]*StoreIndex]{
		OutputState: o.OutputState,
	}
}

func (o StoreIndexMapOutput) MapIndex(k pulumi.StringInput) StoreIndexOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *StoreIndex {
		return vs[0].(map[string]*StoreIndex)[vs[1].(string)]
	}).(StoreIndexOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StoreIndexInput)(nil)).Elem(), &StoreIndex{})
	pulumi.RegisterInputType(reflect.TypeOf((*StoreIndexArrayInput)(nil)).Elem(), StoreIndexArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StoreIndexMapInput)(nil)).Elem(), StoreIndexMap{})
	pulumi.RegisterOutputType(StoreIndexOutput{})
	pulumi.RegisterOutputType(StoreIndexArrayOutput{})
	pulumi.RegisterOutputType(StoreIndexMapOutput{})
}
