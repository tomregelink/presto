Presto: A Poseidon research tool to create artificial vessel trajectories
=========================================================================

The automatic detection of anomalies in the maritime domain requires representative anomalous instances. Presto is an application that enables maritime-domain experts to create artificial anomalous vessel trajectories, characteristic of traffic violations, illegal fishing activities, drug smuggling, or piracy. When merged with existing real-world data the artificial trajectories enable the application and evaluation of machine learning algorithms for the automatic detection of anomalies.

Presto was developed by Jeroen Janssens during his Ph.D. on outlier selection and one-class classification at [Tilburg University](http://www.tilburguniversity.edu/) for the [Poseidon project](http://www.esi.nl/poseidon/). It was first demonstrated at the 22nd Benelux Conference on Artificial Intelligence:

Janssens, J.H.M. and Hiemstra, H. and Postma, E.O. [Creating artificial vessel trajectories with Presto](http://www.jeroenjanssens.com/publications/janssens2010cav.pdf).
In *Proceedings of the 22nd Benelux Conference on Artificial Intelligence*, Luxembourg, 2010 

![Screenshot of Presto](/presto-screenshot.png)

[Tilburg University](http://www.tilburguniversity.edu/), [Embedded Systems Institute](http://www.esi.nl/), and [Thales Nederland BV](http://www.thalesgroup.com/NLHome/) have kindly given permission to make Presto open source.



Build Presto from source
-----------------------

To build the Presto application, you will need [Eclipse 3.4.2 for RCP/Plug-in Developers](http://www.eclipse.org/downloads/packages/eclipse-rcpplug-developers/ganymedesr2) with the RCP plugin (Rich Client Applications) and a Windows machine.

Import Presto in Eclipse:

 1. In the Eclipse package explorer, right-click and select Import
 2. Under Plug-in Developement, select Plugin-ins and Fragments and click Next
 3. Specify the plugin location
 4. In 'Add Source Code Locations', add source (Presto/src)
 5. Click Next
 6. You will get a list of plug-ins and fragments found. Select Presto and click Add
 7. Click Finish to import the Presto plugin

You should now be able to build and run Presto in Eclipse.



License
-------

Copyright Tilburg University. Distributed under the GPLv3 license.
